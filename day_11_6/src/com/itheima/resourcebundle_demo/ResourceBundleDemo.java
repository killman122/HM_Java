package com.itheima.resourcebundle_demo;

import java.util.ResourceBundle;

/*
    java.util.ResourceBundle :它是一个抽象类
    我们可以使用它的子类PropertyResourceBundle来读取以.properties结尾的配置文件
    static ResourceBundle getBundle(string baseName) 可以根据名字直接获取默认语言环境下的属性资源
    参数注意:baseName
        1.属性集名称不含扩展名。
        2.属性集文件是在src目录中的
    比加: src中存在一个文件 user.properties
    ResourceBundle bundle = ResourceBundle.getBundle("user");

    ResourceBundle中常用方法:
        String getString(string key):通过健，获取对应的值
优点 :快速读取属性文件的值

    需求
    通过ResourceBundle工具类
    将一个属性文件 放到src目录中，使用ResourceBundle去获取键值对数据
 */
public class ResourceBundleDemo {
    public static void main(String[] args) {
        ResourceBundle bundle = ResourceBundle.getBundle("user");//Can't find bundle for base name user, locale zh_CN
        String username = bundle.getString("username");//通过对应的key键找到与其对应的值
        System.out.println(username);//获取到的集合中的指定的key值的value值username
        System.out.println(bundle.getString("password"));
    }
}
