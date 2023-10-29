package com.itheima.file_demo;

import java.io.File;
import java.io.IOException;

/*
    File类的创建功能:
        1 public boolean creatNewFile() 创建一个空的文件
        2 public boolean mkdir() 创建一个单级文件夹
        3 public boolean mkdirs() 创建多级文件夹

    创建多级文件夹
        aaa文件夹
            ---bbb文件夹
                ---ccc文件夹
 */
public class FileDemo2 {
    public static void main(String[] args) throws IOException {
        boolean newFile = new File("day24/src/com/itheima/file_demo\\abc.txt").createNewFile();//注意这里的相对路径可以直接使用linux中的/的路径,也可以使用,但是使用windows下的路径字符,需要使用\\防止路径被转义
        System.out.println(newFile);
        System.out.println(new File("day24\\src\\com\\itheima\\file_demo\\abcd.txt").createNewFile());

        //创建一个文件夹在当前目录下
        System.out.println(new File("day24/src/com/itheima/file_demo\\文件夹").mkdir());
        System.out.println(new File("day24/src/com/itheima/file_demo/文件夹1").mkdir());
        System.out.println(new File("day24\\src\\com\\itheima\\file_demo\\文件夹2").mkdir());

        //创建一个多级目录文件夹
        System.out.println(new File("day24/src/com/itheima/file_demo/a/b/c").mkdirs());//连带父路径中的文件夹一起创建,如果只是使用mkdir方法会出现异常,因为不能创建一个多级文件夹但是不创建它的父文件夹
        System.out.println(new File("day24/src/com/itheima/file_demo\\d\\b\\c" ).mkdirs());
        System.out.println(new File("day24\\src\\com\\itheima\\file_demo\\b\\e\\f" ).mkdirs());
    }
}