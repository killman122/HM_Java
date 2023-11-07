package com.itheima.outputstream_demo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
    ### **字节流写数据的**3种方式

| **方法名**                              | **说明**                     |
| --------------------------------------- | ---------------------------- |
| void  write(int b)                      | 一次写一个字节数据           |   可以接收int char byte 类型数据,因为数据的范围更大
| void  write(byte[] b)                   | 一次写一个字节数组数据       |
| void  write(byte[] b, int off, int len) | 一次写一个字节数组的部分数据 |

### **字节流写数据的换行和追加写入**
 */
public class OutputStreamDemo4 {
    public static void main(String[] args) throws IOException {
        //创建字节输出流对象
//        FileOutputStream fos = new FileOutputStream("day24/src/com/itheima/outputstream_demo/输出流.txt");
        FileOutputStream fos = new FileOutputStream(new File("day24/src/com/itheima/outputstream_demo/输出流.txt"));
        //由于FileOutputStream流对象的参数必须是一个File的对象,所以可以通过new File()方法创建一个File匿名内部类对象,然后将File对象作为参数传入FileOutputStream流对象中

        //写数据
        // void write(int b)  一次写一个字节数据
        fos.write(65);
        fos.write(66);
        fos.write(67);
        // void write(byte[] b) 一次写一个字节数组
        byte [] arr = {65,66,67,68,69,70};
        fos.write(arr);
        // void  write(byte[] b, int off, int len)  一次写一个字节数组的部分数据 第二个参数表示索引开始的地址 第三个参数表示数据的长度
        fos.write(arr,2,3);

        //将字符串转为byte类型,将byte类型数据写入输出流中
        byte[] bytes = "王道888".getBytes();
        fos.write(bytes);
        //释放资源
        fos.close();

    }
}
