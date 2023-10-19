package com.itheima.genericity_demo.list_demo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Demo2_List {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();//ArrayList集合和python中列表还是非常相似的
        list.add("热巴");
        //添加数据
        list.add("迪丽热巴");
        list.add("阿西巴");
        list.add("欧阳那哈");
        list.add("欧阳那哈");
        //add方法在指定的索引位置处添加元素,注意这里的索引的开始位置也是从0开始的
        list.add(1,"哈哈哈");
        list.add(2,"大美女");
        System.out.println(list);
        //remove方法可以删除指定索引位置的元素,并返回被删除的元素
        list.remove(1);
        System.out.println(list);
        //get方法可以获取指定索引位置的元素
        System.out.println(list.get(1));
        //set方法可以修改指定索引位置的元素,并返回修改前的元素
        System.out.println(list.set(1,"小美人"));
        System.out.println(list);
        /*
            IndexOutOfBoundsException:索引越界异常
                原因:你访问了不存在的索引
                解决办法:访问索引的时候要注意,索引的范围是0到size()-1
            ArrayOutOfBoundsException:数组越界异常
                原因:你访问了不存在的索引
                解决办法:访问索引的时候要注意,索引的范围是0到数组的长度-1
            StringOutOfBoundsException:字符串越界异常
                原因:你访问了不存在的索引
                解决办法:访问索引的时候要注意,索引的范围是0到字符串的长度-1
                
                
            ### 集合的遍历方式
                - 增强for循环,就是不是fori的那个
                - 接口中继承来的迭代器遍历
                - 普通for循环
         */
        //对集合中的元素遍历使用多种方式
        //增强for循环
        for (String s : list) {
            System.out.println(s);
        }
        //普通for循环
        for (int i = 0; i < list.size(); i++) {
            System.out.println(i+"--"+list.get(i));
        }
        //迭代器遍历
        //获取迭代器
        Iterator<String> iterator = list.iterator();
        //判断迭代器中是否为空
        while (iterator.hasNext()) {
            //获取迭代器中的元素
            String next = iterator.next();
            System.out.println(next);
        }
    }
}
