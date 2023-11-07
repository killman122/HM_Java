package com.itheima.inputstream_demo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
    字节输入流读数据快速入门 :一次读一个字节
    第一部分 :字节输入流类
    Inputstream类:字节输入流最顶层的类，抽象类
        --- FileInputStream类 : FileInputStream extends InputStream
    第二部分 :构造方法
        public FileInputStream(File file): 从file类型的路径中读取数据
        public FileInputStream(string name): 从字符串路径中读取数据
    读数据的方法 :
    public int read():从此输入流中读取一个数据字节 ，读不到数据会返回-1

    第三部分:字节输入流步骤
    1 创建输入流对象
    2 读数据
    3 释放资源
 */
public class FileInputStreamDemo1 {
    public static void main(String[] args) throws IOException {
        //创建字节输入流对象
        //字节输入流指向的文件如果不存在报错!!!
        FileInputStream inputStream = new FileInputStream("idea相对路径文档写入测试.txt");
        //读数据
        //public int read():从此输入流中读取一个数据字节 ，读不到数据会返回-1
//        int read = inputStream.read();
////        System.out.print(read);/
//        System.out.print((char)read);
//        read = inputStream.read();
////        System.out.print(read);
//        System.out.print((char)read);
//        read = inputStream.read();
////        System.out.print(read);
//        System.out.print((char)read);
////        System.out.print(read);
//        read = inputStream.read();
//        System.out.print((char)read);
////        System.out.print(read);
//        read = inputStream.read();
//        System.out.print((char)read);
////        System.out.print(read);
//        read = inputStream.read();
//        System.out.print((char)read);
        /*while (true){
            int read = inputStream.read();
            if (read!=-1){//读到数据
                System.out.print((char)read);
            }else {//当读不到数据则返回-1,这里的读不到可以是数据已经被读完了
                break;
            }
        }*/

        int read;
        while ((read=inputStream.read())!=-1){//直接判断读取的数据是否为-1,将判断是否还有数据的操作放在了while循环的条件中,节省了一定的代码
            System.out.print((char)read);
        }
    }
}
