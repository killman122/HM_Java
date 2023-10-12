package org.eu.wangdao.test;

import org.eu.wangdao.student.Student;

public class TestStudent {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student("蔡徐坤");
        Student s3 = new Student("蔡徐坤", 18);
        System.out.println(s1.name + "..." + s1.age);
        System.out.println(s2.name + "..." + s2.age);
        System.out.println(s3.name + "..." + s3.age);
    }
}
