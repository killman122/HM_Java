package com.itheima.object_stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

/*
    对象字节输入流的使用: 将文件中保存的对象读取到内存中使用,反序列化对象
 */
public class ObjectInputStreamTest {
    public static void main(String[] args) {
        //创建一个对象字节输入流管道, 包装 低级的字节输入流与源文件接通
        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("day_11_6/user.txt"))) {
            User u = (User) objectInputStream.readObject();//原来使用readObject()方法返回的是一个Object类型的对象,现在使用强制类型转换将其转换为User类型,所以是一个User类对象
            System.out.println(u);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
