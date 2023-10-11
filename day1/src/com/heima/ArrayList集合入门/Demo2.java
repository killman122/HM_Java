package com.heima.ArrayList集合入门;

import java.util.ArrayList;

/*
    ArrayList 集合存储数据的特点:
        有序可重复

 */
public class Demo2 {
    public static void main(String[] args) {// 这里更加验证了list集合更像是python中的列表,存储的数据可以发生重复,并且是有序的序列在python中集合是无序的并且是去重的
        ArrayList<Object> list = new ArrayList<>();
        list.add("张三0");
        list.add("张三1");
        list.add("张三2");
        list.add("张三3");
        list.add("张三4");
        list.add("张三5");
        list.add("张三6");
        list.add("张三0");
        list.add("张三1");
        list.add("张三2");
        list.add("张三3");
        list.add("张三4");
        list.add("张三5");
        list.add("张三6");
        System.out.println(list);
    }
}
