package com.itheima.properties;

import javax.crypto.spec.PSource;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

/*
    目标: 掌握使用Properties类读取属性文件中的键值对信息
 */
public class PropertiesTest1 {
    public static void main(String[] args) throws IOException {
        //创建一个Properties的对象(本质上是一个键值对集合,继承于Map接口,空容器)
        Properties properties = new Properties();
        System.out.println(properties);//在这时候输出的是一个空的map子类对象
        //使用Properties对象的load方法读取属性文件中的键值对信息,开始加载属性文件中的键值对信息到Properties对象中
        properties.load(new FileReader("day_11_6/user.properties"));
        System.out.println(properties);//{userPassword=123456, userName=zhangsan}
        //可以通过forEach或者是keySet,EntrySet等方式遍历
        properties.forEach((key,value)->{
            System.out.println(key+"="+value);
        });
    }
}
