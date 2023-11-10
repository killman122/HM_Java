package com.itheima.transform_stream;

import java.io.*;

/*
    掌握字符输出转换流的使用
 */
public class OutputStreamWriteDemo {
    public static void main(String[] args) {
        //指定写出的字符编码
        try (   //将所有的创建流对象的都写在()中可以自行调用close()方法关闭
                //创建一个文件字节输出流
                OutputStream fileOutputStream = new FileOutputStream("day_11_6/src/wangdao666.txt");
                //把原始的字节输出流,按照指定的字符集编码转换成字符输出转换流
                Writer gbk = new OutputStreamWriter(fileOutputStream,"GBK");//得到一个指定字符集编码的字符输出流,并使用多态的形式将字符输出转换流引用给一个Write字符输出流便于后面调用缓冲字符流的时候当作参数传入,当然这里也可以不转换
//                OutputStreamWriter gbk = new OutputStreamWriter(fileOutputStream,"GBK");//得到一个指定字符集编码的字符输出流,并使用多态的形式将字符输出转换流引用给一个Write字符输出流便于后面调用缓冲字符流的时候当作参数传入,当然这里也可以不转换
                //把字符输出流包装成缓冲字符输出流
                BufferedWriter bufferedWriter = new BufferedWriter(gbk);
        ) {
            bufferedWriter.write("米雪冰川");
            bufferedWriter.write("\r\n");
            bufferedWriter.write("米雪冰川");
            bufferedWriter.write("米雪冰川");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
