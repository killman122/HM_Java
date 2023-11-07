package com.itheima.properties;

import java.util.Properties;
import java.util.Set;

/*
    1 properties是一个Map体系的集合类
        - public class Properties extends Hashtable <Object,Object>
    2 为什么在IO流部分学习Properties
        - Properties中有跟IO相关的方法
    3 当做双列集合使用
        - 不需要加泛型，工作中只存字符串,默认不加泛型的情况下泛型出填写的是字符串

    以properties为后缀文件的,就是配置文件,一般都是以key-value的键值对形式
 */
public class Properties_Demo1 {
    public static void main(String[] args) {
        // 创建集合对象
        Properties properties = new Properties();
        // 添加元素
        properties.put("it001", "hello");//添加键值对,该方法继承接口Map能够实现向集合中添加键值对的功能,在所有的双列集合中
        properties.setProperty("it002", "world");//该方法是Properties特有的方法,该方法的作用是向集合中添加键值对,该方法的参数都是字符串类型
        properties.setProperty("it003", "java");
        // 遍历集合
        /*Set<Object> set = properties.keySet();//使用keySet()方法获取集合中的所有键,并且返回一个Set集合,在通过对应集合中的key使用get方法获取集合中的每个value值
        for (Object key : set) {
            Object value = properties.get(key);
            System.out.println(key + "=" + value);
        }*/
        Set<String> stringPropertyNames = properties.stringPropertyNames();//使用stringPropertyNames方法返回的一定是String类型的数据
        for (String stringPropertyName : stringPropertyNames) {
            String value = properties.getProperty(stringPropertyName);
            System.out.println(stringPropertyName + "=" + value);
        }
    }
}
