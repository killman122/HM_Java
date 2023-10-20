package com.itheima.treeset_demo.comparable_demo;

import java.util.Iterator;
import java.util.TreeSet;
/*
    需求: 改写存储学生对象的案例,并按照年龄从小到大排列
    需求1: 改写刚刚的学生案例:
    要求: 按照年龄从小到大排序,如果年龄一样,则按照姓名首字母排序,如果姓名和年龄一样大,才认为是同一个学生对象,不计入
    思路:
        1.定义学生类
        2.创建TreeSet集合对象
        3.创建学生对象
        4.将学生对象添加到集合中
        5.遍历集合
 */
public class ComparableDemo {
public static void main(String[] args) {
        //创建集合对象
        TreeSet<Student> ts = new TreeSet<>();
        Student student = new Student("王道",21);
        Student student1 = new Student("王三思",22);
        Student student2 = new Student("王后行",23);
        Student student3 = new Student("王阳明",24);
        //向集合中添加元素
        ts.add(student);
        ts.add(student1);
        ts.add(student3);
        ts.add(student2);
        //遍历集合元素
        for (Student i : ts) {
            System.out.println(i);
        }
        //在遍历输出时会报异常ClassCastException,需要将集合元素所在的类中实现Comparable接口,重写接口中的compareTo方法
//        System.out.println("使用增强for循环的方式将集合中的元素遍历输出,但是需要注意的是一般的set集合元素好像都是无序去重(但是有的去重需要将hashCode和equal方法改写)的");
        Iterator<Student> iterator = ts.iterator();
//        while (iterator.hasNext()) {
////            System.out.println(iterator.next());
//        }
        //可以看到打印输出的元素不仅仅是去重过的,而且打印的元素话还是按照由小到大的排序方式排列过的
    }
}
