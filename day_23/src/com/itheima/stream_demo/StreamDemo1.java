package com.itheima.stream_demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/*
    需求：按照下面的要求完成集合的创建和遍历
    创建一个集合，存储多个字符串元素
    把集合中所有以"张"开头的元素存储到一个新的集合
    把"张"开头的集合中的长度为3的元素存储到一个新的集合
    遍历上一步得到的集合

 */
public class StreamDemo1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        //为了方便,直接调用collections工具类中的AddAll方法,否则需要使用list.add()
        Collections.addAll(list,"张无忌", "张翠山","张三丰","谢广坤","赵四","刘能","小沈阳","张良");
//        System.out.println(list);
        //把集合中所有以"张"开头的元素存储到一个新的集合
        ArrayList<String> newList = new ArrayList<>();
        for (String s : list) {
            if (s.startsWith("张")) {//判断字符串是否以"张"开头,调用String类中的方法,注意不是ArrayList及其父类中的方法
                newList.add(s);
            }
        }
        System.out.println(newList);
        // 把"张"开头的集合中的长度为3的元素存储到一个新的集合
        ArrayList<String> newList2 = new ArrayList<>();
        for (String s : newList) {
            if (s.length() == 3) {
                newList2.add(s);
            }
        }
        System.out.println(newList2);
        //遍历上一步得到的集合,由于使用过了增强for循环,这里使用迭代器的方式进行遍历
        Iterator<String> iterator = newList2.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println("==================================");
        //使用stream流的方式进行遍历
        list.stream().filter(s -> s.startsWith("张")&& s.length() == 3).forEach(System.out::println);
    }
}
