package com.itheima.inputstream_demo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
    ### 提高拷贝速度的解决方案

一次读一个字节数组的方法：

- public int read(byte[] b)：从输入流读取最多b.length个字节的数据

- __返回的是真实读到的数据个数__
- 如果读不到数据, 那么返回值-1

需求1 : 在当前模块下创建一个文件 , 文件存储数据hello world , 定义长度为5的字节数组进行读取数据

需求2 : 对复制图片的代码进行使用一次读写一个字节数组的方式进行改进
 */
public class FileInputStreamDemo3 {
    public static void main(String[] args) throws IOException {
        //创建字节输入流对象
        FileInputStream inputStream = new FileInputStream("D:\\IdeaProject\\HM_Java\\day24\\src\\com\\itheima\\inputstream_demo\\copy.png");
        //public int read(byte[] b)：从输入流读取最多b.length个字节的数据
        byte[] bytes = new byte[1024];//给出1MB
        int len;//记录的是每次真实读到的数据的个数abc则为3
        while ((len=inputStream.read(bytes))!=-1){
            System.out.println(new String(bytes,0,len));//将每次读入的数据传给String构造器的偏移量offset这里为len
        }
        //释放输入流的资源
        inputStream.close();
        //len = inputStream.read(bytes);//read()方法的返回值表示数据的个数
        /*System.out.println(len);
        System.out.println(bytes);
        System.out.println(new String(bytes));
        inputStream.close();*/
    }
}
