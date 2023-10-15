package com.itheima.api_learn.objects_demo;

import java.util.Objects;

public class Test {
    public static void main(String[] args) {
        Student student = null;
        Student student1 = new Student("王道",21);
//        System.out.println(student.equals(student1));
        System.out.println(Objects.equals(student, student1));
    }
}
