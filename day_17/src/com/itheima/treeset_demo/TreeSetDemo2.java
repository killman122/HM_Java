package com.itheima.treeset_demo;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetDemo2   {
    public static void main(String[] args) {
        //创建集合对象
        TreeSet<Student> tS = new TreeSet<>();
        //创建学生对象
        Student student = new Student("张三",20);
        Student student1 = new Student("李四",20);
        Student student2 = new Student("李四",20);
        //向集合对象中添加元素
        tS.add(student);
        tS.add(student1);
        tS.add(student2);
        //遍历集合对象
        for (Student t : tS) {
            System.out.println(t);
        }
        System.out.println("-------------------------");
        Iterator<Student> iterator = tS.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }
}
