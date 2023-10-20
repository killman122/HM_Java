package com.itheima.treeset_demo;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetDemo1 {
    public static void main(String[] args) {
        //创建集合对象
        TreeSet<Integer> ts = new TreeSet<>();
        //向集合中添加元素
        ts.add(20);
        ts.add(30);
        ts.add(40);
        ts.add(50);
        ts.add(20);
        //遍历集合元素
        for (Integer i : ts) {
            System.out.println(i);
        }
        System.out.println("使用增强for循环的方式将集合中的元素遍历输出,但是需要注意的是一般的set集合元素好像都是无序去重(但是有的去重需要将hashCode和equal方法改写)的");
        Iterator<Integer> iterator = ts.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        //可以看到打印输出的元素不仅仅是去重过的,而且打印的元素话还是按照由小到大的排序方式排列过的
    }
}
