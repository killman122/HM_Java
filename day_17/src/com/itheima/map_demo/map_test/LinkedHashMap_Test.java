package com.itheima.map_demo.map_test;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/*
    LinkedHashMap类，在最底层采用的数据结构:是链表+哈希表。特点 :
        1 元素键唯一
        2 有序
    需求: 创建LinkedHashMap对象，添加元素进行验证 元素唯一 ，有序的特点
 */
public class LinkedHashMap_Test {
    public static void main(String[] args) {
        LinkedHashMap<Integer, String> linkedHashMap = new LinkedHashMap<>();
        //添加元素
        linkedHashMap.put(111,"张三");
        linkedHashMap.put(111,"李思思");
        linkedHashMap.put(222,"思思");
        linkedHashMap.put(444,"思思");
        linkedHashMap.put(333,"王五");
        System.out.println(linkedHashMap);//从这里的输出可以确定在linkedHashMap集合中的元素是去重的
        //System.out.println(linkedHashMap);
        //遍历集合元素,使用keySet()获取键集合的方式遍历整个集合中的每一个元素
        Set<Integer> integers = linkedHashMap.keySet();//通过keySet()方法获取到集合中所有的key并存储在另一个集合中
        System.out.println(integers);
        for (Integer i : integers) {
            String value = linkedHashMap.get(i);
            System.out.println("key: "+i+"------value: " + value);
        }
        //第二种方式,使用entrySet()方法遍历集合中的元素,获取到所有的键值对存储到一个Set集合中,集合中的形式为键值对应的形式中间使用=链接
        Set<Map.Entry<Integer, String>> entries = linkedHashMap.entrySet();
        System.out.println(entries);
        //使用增强for循环的方式遍历集合中的元素,之后在使用getValue/getKey的方式取得元素
        for (Map.Entry<Integer, String> entry : entries) {
            Integer key = entry.getKey();
            String value = entry.getValue();
            System.out.println("key=" + key + " value=" + value);
        }
    }
}
