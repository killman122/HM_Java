package com.itheima.file_demo;

import java.io.File;
import java.io.IOException;

/*
    绝对路径: 从盘符开始的路径
    相对路径: 从当前目录开始的路径,相对与idea工具下在使用idea编写的过程中
 */
public class PathDemo {
    public static void main(String[] args) throws IOException {
        //绝对路径: 从盘符开始的路径
        System.out.println(System.getProperty("user.dir"));
        //相对路径: 从当前目录开始的路径,相对与idea工具下在使用idea编写的过程中
        System.out.println(System.getProperty("file.separator"));
        //使用绝对路径创建一个文件
        new File("D:\\idea文档写入测试.txt").createNewFile();
        //使用默认相对路径创建一个空的文件
        File file = new File("idea相对路径文档写入测试.txt");//相对路径如果不指定,则默认在项目的根目录中
        file.createNewFile();
        //在指定路径的相对路径中创建文件
        new File("day24\\src\\com\\itheima\\file_demo\\idea相对路径文档写入测试.txt").createNewFile();//相对路径在这里指的是去除盘符后,在加上仓库的根路径进行路径的查找
        //在idea中写代码,相对路径就是项目的根目录
    }
}
