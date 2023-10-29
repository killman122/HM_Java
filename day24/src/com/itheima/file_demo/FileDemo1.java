package com.itheima.file_demo;

import java.io.File;

/*
 * 文件操作
 * File:它是文件和目采路径名的抽象表示
    文件和目录可以通过FiLe封装成对象
    File封装的对象仅仅是一个路径名。它可以是存在的，也可以是不存在的。构造方法:
    1 File(String pathname) 通过将给定的路径名字符串转换为抽象路径名来创建新的 FiLe实例
    2 File(String parent，string child) 从父路径名字符中和子路径名字符中创处新的 File实例
    3 File(File parent，String child)   从父抽象路径名和子路径名字符串创建新的 File实例
    注意事项 : 父路径需要的是一个目录路径
 */
public class FileDemo1 {
    public static void main(String[] args) {
    //1 File(String pathname) 通过将给定的路径名字符串转换为抽象路径名来创建新的 FiLe实例
        File file = new File("D:\\经验.txt");//估计这里使用\\是为了转义字符
        System.out.println(file.getAbsolutePath());
        System.out.println(file);//打印的是文件的路径值
    //2 File(String parent，string child) 从父路径名字符中和子路径名字符中创处新的 File实例
        File file1 = new File("D:\\", "经验.txt");//当获取的parent不是一个字符串类型数据时,需要使用File类的构造方法当作参数传入,调用第三种创建File对象的方式--传入对象作参数
        System.out.println(file1);
    //3 File(File parent，String child)   从父抽象路径名和子路径名字符串创建新的 File实例
        File file2 = new File(new File("D:\\"), "经验.txt");
        System.out.println(file2);
    }
}
