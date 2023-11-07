package com.itheima.properties;

import java.io.*;
import java.util.Properties;

/*
    和IO流结合的方法
        void load(InputStream inStream) : 以字节流形式，把文件中的键值对，读取到集合中
        // void Load(Reader reader) 以字符流形式 ，把文件中的健值对，读取到集合中
        void store(OutputStream out，String comments)把集合中的键值对，以字符流形式写入文件中 ，参数二为注释
        // void store(Writer writer, String comments) 把集合中的键值对，以字节流形式写入文件中 ，参数二为注释

    需要格外注意的是在使用load还是使用store方法时存储的文件或者读取的文件都是使用'='连接的key-value的键值对类型的数据
 */
public class Properties_Demo2 {
    public static void main(String[] args) throws IOException {
//        method();
        //创建集合对象
        Properties properties = new Properties();
        //添加元素
        properties.setProperty("it001", "hello");
        properties.setProperty("it002", "wangdao");
        properties.setProperty("it003", "zhangsan");
        //在下面的store()存储方法中存储的是OutputStream类的数据,所以这里可以直接使用文件输出流,也可以使用字节输出流,并且有一个参数comments的注释参数,注意的是注释参数也是要写在写入的文件中的,另外注释必须要使用英文进行编写,如果不需要注释也可以在注释的参数的位置填写null表示空
        //注意在写入的过程中是逆序的写入,最先运行的代码在最下方,有点像是一个压栈的过程
        properties.store(new BufferedOutputStream(new FileOutputStream("day_11_6/test.properties")), "test");//使用字节流操作中文数据可能会造成乱码,但是使用字符流可以解决中文乱码的问题
    }

    private static void method() throws IOException {
        // 创建集合对象
        Properties properties = new Properties();
        System.out.println(properties);//{},双列集合和python中的字典非常的相似
        // void load(InputStream inStream) : 以字节流形式，把文件中的键值对，读取到集合中
        properties.load(new BufferedInputStream(new FileInputStream("day_11_6/test.properties")));//BufferedInputStream类属于InputStream类的子类
        System.out.println(properties);//{it001=hello, it002=world, it003=java}使用字节流操作中文数据可能会造成乱码,但是使用字符流可以解决中文乱码的问题
    }
}
