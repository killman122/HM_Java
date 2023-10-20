package com.itheima.collections_demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class SortDemo3 {
    public static void main(String[] args) {
        //定义集合
        ArrayList<Student> arrayList = new ArrayList<>();
        //向集合中添加元素
        arrayList.add(new Student("张三", 26));
        arrayList.add(new Student("赵四", 25));
        arrayList.add(new Student("王五", 24));
        arrayList.add(new Student("老六", 23));
        System.out.println("排序前的集合结果"+arrayList);
        Collections.sort(arrayList,new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                //return 0;
                //return o1.getAge() - o2.getAge();//升序排列
                //return o2.getAge() - o1.getAge();//降序排列
                //return o1.getName().compareTo(o2.getName());//升序排列
                return -o1.getName().compareTo(o2.getName());//降序排列根据年龄进行排序,这里主要是通过不同的name之间的unicode码值不同
            }
        });
        System.out.println("排序后的集合结果"+arrayList);
    }
}
