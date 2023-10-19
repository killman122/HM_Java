package com.itheima.genericity_demo.set_demo;

import java.util.LinkedHashSet;

/*
    LinkHashSet : 底层数据结构: 链表+哈希表
    链表 : 保证元素的有序
    哈希表 : 保证元素的唯一
 */
public class Demo4_LinkHashSet {
    public static void main(String[] args) {
        LinkedHashSet<Integer> LHS = new LinkedHashSet<>();
        LHS.add(10);
        LHS.add(10);
        LHS.add(20);
        LHS.add(20);
        LHS.add(30);
        LHS.add(30);
        System.out.println(LHS);//实现了有序并且元素唯一
//        System.out.println("输出10的算数左移", 80);
    }
}
