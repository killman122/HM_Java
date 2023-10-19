package com.itheima.genericity_demo.list_demo;

import java.util.LinkedList;

public class Demo4_LinkedList {
    public static void main(String[] args) {
        //创建一个LinkedList对象
        LinkedList<String> list = new LinkedList<>();
        list.add("虚竹");
        list.add("乔峰");
        list.add("段誉");
        list.add("南灯和尚");
        list.add("慕容复");
        //在集合的开头添加元素
        list.addFirst("张三丰");
        //打印获取最后一个元素
        System.out.println(list.getLast());
        System.out.println(list);
        //打印获取第一个元素
        System.out.println(list.getFirst());
        //在集合的结尾添加元素
        list.addLast("杨过");
        System.out.println("--------删除元素前-------");
        System.out.println(list);
        //删除第一个元素
        System.out.println("---------删除第一个元素后---------");
        list.removeFirst();
        System.out.println(list);
        //删除最后一个元素
        list.removeLast();
        System.out.println("---------删除最后一个元素后--------");
        System.out.println(list);
        System.out.println(list.get(1));
    }
}
