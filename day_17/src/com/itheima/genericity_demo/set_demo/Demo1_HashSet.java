package com.itheima.genericity_demo.set_demo;

import java.util.HashSet;
import java.util.Iterator;
/*
    Set集合的特点:
            1 无序    (存储顺序不一致)
            2 没有索引
            3 保证元素唯一
    练习:使用HashSert集合存储字符串并遍历,由于HashSet集合中存储的是字符串,String类型中默认已经重写了hashCode()方法和equals()方法,所以不会出现重复的元素,并且没有索引,所以不能使用普通for循环进行遍历
 */
public class Demo1_HashSet {
    public static void main(String[] args) {
        //创建HashSet集合对象
        HashSet<String> hs = new HashSet<>();
        //添加集合元素
        hs.add("hello");
        hs.add("关羽");
        hs.add("张飞");
        hs.add("赵云");
        hs.add("赵云");
        hs.add("马超");
        hs.add("马超");
        hs.add("黄忠");
        //遍历集合
        for (String h : hs) {
            System.out.println(h);
        }
        System.out.println("-----------------------");
        //使用迭代器的方式获取集合中的元素遍历
        Iterator<String> iterator = hs.iterator();
        while (iterator.hasNext()) {
            String next = iterator.next();
            System.out.println(next);
        }
        //注意在使用普通for循环进行数据的处理时,没有索引值,所以不能通过使用普通for循环的方式获取集合中中的元素并进行打印输出,由于使用的对象是一个集合并且是HashSet集合,所以不能使用get方法,除非自己构造方法,但是这样做没有任何意义
    }
}
