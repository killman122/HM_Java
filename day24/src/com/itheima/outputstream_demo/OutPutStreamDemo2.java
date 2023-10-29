package com.itheima.outputstream_demo;

import java.io.*;

/*
    字节输出流写数据快速入门
        第一部分 : 字节输出流类
            OutputStream类 : 字节输出流最顶层的类,抽象类
                public class FileOutputStream extends OutputStream
            FileOutputStream类 : 文件字节输出流
 */
public class OutPutStreamDemo2 {
    public static void main(String[] args) throws IOException {
        File file = new File("day24/src/com/itheima/outputstream_demo/输出流.txt");
        System.out.println(file.createNewFile());//输出是否成功创建文件
        //创建字节输出流对象
        //public FileOutputStream(String name) : 往String类型的路径中写入数据
        /*
            如果字节输出流指向的文件不存在,那么会创建一个新的空的文件
            如果字节输出流指向的文件存在,那么会把文件中的数据清空
         */
        FileOutputStream fileOutputStream = new FileOutputStream("day24/src/com/itheima/outputstream_demo/输出流.txt");//字符串对象中表示要输出的文件地址
        //OutputStream outputStream = new OutputStream();//虽然抽象类具有构造器,但是不能使用new关键字实例化对象
        //写数据
        fileOutputStream.write(97);
        fileOutputStream.write(99);
        fileOutputStream.write(98);

        //释放资源
        fileOutputStream.close();//TODO 在这里能否和python一样,直接通过with方法实现自动关闭输入/输出流
    }
}
