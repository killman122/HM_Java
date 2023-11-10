package com.itheima.transform_stream;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;

/*
    将使用gbk编码的文件打开并使用转换流进行读取
 */
public class InputStreamReaderDemo {
    public static void main(String[] args) {
        //得到文件的原始字节流(GBK的字节流测试),使用多态的方式父类引用子类对象
        try (
                InputStream inputStream = new FileInputStream("day_11_6/src/wangdao666");
                //把原始的字节输入流按照执行的字符集编码转换成字符输入流
                InputStreamReader inputStreamReader = new InputStreamReader(inputStream, "gbk");//第一参数是原始的字节输入流,第二个参数是编码格式GBK
                //把字符输入流包装成缓冲字符输入流
                BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        ) {
            String line;// 这里的line中存储的是按行存储的数据,也就是一行的数据
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
