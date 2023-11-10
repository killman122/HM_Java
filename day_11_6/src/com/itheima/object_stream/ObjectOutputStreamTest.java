package com.itheima.object_stream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjectOutputStreamTest {
    public static void main(String[] args) {
        //创建一个Java对象
        User user = new User("admin", "管理员", "123456", 18);
        //将用户对象序列化
        //创建一个对象字节输出流包装原始的字节输出流
        try(ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("day_11_6/user.txt"));) {
//            new ObjectOutputStream(new FileOutputStream("day_11_6/user.txt")).writeObject(user);
            objectOutputStream.writeObject(user);//java.io.NotSerializableException: com.itheima.object_stream.User
            //在Java中如果要对某个对象序列化，那么这个对象所属的类必须实现Serializable接口
            System.out.println("序列化成功");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
