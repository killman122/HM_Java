package com.itheima.charset_demo;

import java.io.UnsupportedEncodingException;
import java.sql.SQLSyntaxErrorException;
import java.util.Arrays;

/*
    目标: 掌握如何使用Java代码完成对于字符的编码和解码
 */
public class Test {
    public static void main(String[] args) throws UnsupportedEncodingException {//抛出一个不支持编码异常
        //编码
        String data = "a我你b";
        byte[] bytes = data.getBytes();//默认使用的是U按照平台字符集的UTF-8编码
        System.out.println(new String(bytes));//a我你b
        System.out.println(Arrays.toString(bytes));//[97, -26, -120, -111, -28, -67, -96, 98]

        //按照指定字符集进行编码
        byte[] bytes1 = data.getBytes("GBK");//按照GBK字符集进行编码,将字符串转换为字节数组
        System.out.println(bytes1);
        System.out.println(Arrays.toString(bytes1));//[97, -42, -48, -50, -60, 98]

        //编码
        String s = new String(bytes);//将byte类型的对象通过使用String类型的构造器转换为字符串,默认情况下按照UTF-8进行编码
        System.out.println(s);

        //按照指定的字符集进行解码
        System.out.println(new String(bytes));//按照UTF-8字符集进行解码,将字节数组转换为字符串,如果使用默认情况下的utf-8的方式解码GBK编码的文件会出现错误
        String s1 = new String(bytes1, "GBK");//按照GBK字符集进行解码,将字节数组转换为字符串
        System.out.println(s1);
    }
}
