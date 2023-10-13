package com.heima.static_demo;

public class StaticDemo {
    public static void main(String[] args) {
        Student.school = "传智教育";
        Student s = new Student();
        s.name = "张三";
        s.age = 23;
//        s.school = "清华大学";
        s.show();
        System.out.println("------------");
        Student s2 = new Student();
        s2.name = "李四";
        s2.age = 24;
        s2.show();
    }
}
