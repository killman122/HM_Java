package com.itheima.properties;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/*
    需求: 在properties 文件中手动写上姓名和年龄.将数据读取到集合中,最后将数据封装为Javabean对象
 */
public class Properties_Demo3 {
    public static void main(String[] args) throws IOException {
        //创建集合对象
        Properties properties = new Properties();
        //把文件中的数据加载到集合中
        properties.load(new FileInputStream("day_11_6/user.properties"));
        //输出集合中的信息
        System.out.println(properties);//{userPassword=123456, userName=zhangsan}
        String userName = properties.getProperty("userName");
        String userPassword = properties.getProperty("userPassword");

        //将集合中的数据取出封装成用户对象
        User user = new User(userName,userPassword);
        System.out.println(user);
    }
}
