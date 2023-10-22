package com.itheima.map_demo.map_test;

import java.util.Set;
import java.util.TreeMap;

/*
    需求: 定义TreeMap集合存储键值对
         键使用Integer,值使用String
         存储若干键值对,遍历集合观察结果是否有排序
 */
public class TreeMapTest1 {
    public static void main(String[] args) {
        //创建集合对象
        TreeMap<Integer, String> treeMap = new TreeMap<>();
        //添加元素到集合中
        treeMap.put(1,"李四");
        treeMap.put(2,"张三");
        treeMap.put(1,"王五");
        treeMap.put(3,"赵六");
        //向集合中添加了四对元素,均为key-value的键值对的形式
        //遍历集合
        Set<Integer> integers = treeMap.keySet();
        for (Integer integer : integers) {
            String value = treeMap.get(integer);
            System.out.println("key: " + integer +"value: "+value);
        }
        System.out.println(integers);//可以输出发现TreeSet集合也具有去重的功能,并且根据key的值进行了默认由小到大的排序

    }
}
