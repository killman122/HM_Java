package com.itheima.genericity_demo.set_demo;

import java.util.HashSet;
import java.util.Set;

/*
    Set集合的特点:
            1 无序    (存储顺序不一致)
            2 没有索引
            3 保证元素唯一
 */
public class Demo_HashSet {
    public static void main(String[] args) {
        //使用多态的方式调用实现类中的方法,引用实现类对象为接口类型
        Set<String> set = new HashSet<>();
        set.add("hello");
        set.add("world");
        set.add("world");
        System.out.println(set);
        //经过上面的验证可以发现,使用HashSet集合存储元素的时候,元素是无序的,没有索引,并且保证元素唯一
    }
}
