package com.heima.String;

import java.util.Arrays;
import java.util.Scanner;

/*
    切割学生的信息字符串,封装成学生对象
 */
public class 练习 {
    public static void main(String[] args) {
        String stuInfo = "张三,男,18";
        //使用split方法切割字符串
        String[] stu = stuInfo.split(",");//使用ctrl+shift+p可以查看对于方法的返回类型是一个String类型的数组
        System.out.println(Arrays.toString(stu));
        String name = stu[0];
        String sex = stu[1];
        String age = stu[2];
        Student student = new Student();
        student.setName(name);
        student.setSex(sex);
        student.setAge(Integer.valueOf(age));//Integer.valueOf()函数的作用是将字符串转为整型数据,对于静态方法的调用一般情况下使用类型调用
        System.out.println(student.getSex());
        System.out.println(student.getName());
        System.out.println(student.getAge());
    }
}
