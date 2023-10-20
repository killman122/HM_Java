package com.itheima.collections_demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortDemo2 {
    public static void main(String[] args) {
        //定义集合
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(3);
        list.add(2);
        list.add(5);
        list.add(4);
        System.out.println("排序前的结果"+list);
        //需要对元素进行降序排列,但是由于在Integer类中Java默认实现lComparable接口,所以不能使用Collections.sort()方法,因为默认的方法是升序排列,但是又由于是Java中定义好的类,所以不能够重写方法
        //调用Collections.sort()方法,传入自定义的比较器对象
        Collections.sort(list, new Comparator<Integer>() {//注意使用匿名内部类和直接使用Comparator接口的区别,这里并不是new出接口对象,接口是抽象类的集合无法使用new,并且这里使用new需要重写接口中的方法compare(),否则会引发异常
            @Override
            public int compare(Integer o1, Integer o2) {
                //return 0;
                //return o1 - o2;//升序排列
                //return o2 - o1;//降序排列
                //return o1.compareTo(o2);//升序排列
                return -o1.compareTo(o2);//降序排列
                //return o2-o1;//降序排列
                /*
                    思路:
                        o1 是什么类型的数据,答:Integer类型数据,其中重写了compareTo()方法并且是升序排序,所以需要降序排列时,在前面加一个-
                 */
            }
        });
        System.out.println("排序后的结果"+list);
    }
}
