package com.itheima.genericity_demo.set_demo;

import java.util.HashSet;
import java.util.Iterator;
/*
    练习: 使用HashSet集合存储自定义对象并遍历
        要求: 如果两个对象的成员变量值都相同,则为同一个对象
    HashSet 集合要想保证集合中元素的唯一性,那么集合中存储的元素的所在类必须重写hashCode方法和equals方法,这样才能保证元素唯一,否则依然不能去重,实现集合中的多个元素是同一种
 */
public class Demo2_HashSet {
    public static void main(String[] args) {
        //创建集合对象
        HashSet<Student> hashSet = new HashSet<>();
        //创建学生对象
        Student student = new Student("张三", 18);
        Student student1 = new Student("李四", 18);
        Student student4 = new Student("李四", 18);
        Student student2 = new Student("王五", 18);
        Student student3 = new Student("赵云", 18);
        //添加元素到集合中
        hashSet.add(student);
        hashSet.add(student1);
        hashSet.add(student2);
        hashSet.add(student2);
        hashSet.add(student3);
        hashSet.add(student4);
        System.out.println("---------------------");
        //遍历集合
        Iterator<Student> iterator = hashSet.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println("--------前面使用的是迭代器的方式遍历数组");
        System.out.println("这里开始使用增强for循环遍历数组");
        for (Student st : hashSet) {
            System.out.println(st);
        }
    }
}
