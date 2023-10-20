package com.itheima.collections_demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ShufferDemo {
    public static void main(String[] args) {
        //创建一个list集合
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        //遍历集合
        for (Integer i : list) {
            System.out.println(i);
        }
        System.out.println("======乱序前======");
        System.out.println(list);
        Collections.shuffle(list);//打乱集合中元素的顺序
        System.out.println("========乱序后=======");
        System.out.println(list);
    }
}
