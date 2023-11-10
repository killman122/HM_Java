package com.itheima.buffer_stream;
import java.io.*;
/*
    掌握字节缓冲流的作用
 */
public class BufferedInputStreamTest {
    public static void main(String[] args) {
        try (
                //定义一个原始的字节输入流
                InputStream is = new FileInputStream("day_11_6/src/wangsansi");
                //定义一个字节缓冲输入流包装原始的字节输入流
                BufferedInputStream inputStream = new BufferedInputStream(is);//直接通过匿名对象的方式创建原始的字节输出流对象直接带入字节缓冲输出流
                BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream("day_11_6/src/wangsansiceshi"));//在缓冲池对象中的第二个参数可以指定缓冲池的缓冲数据大小
        ) {
            byte[] bytes = new byte[1024];
            int len;
            while ((len = inputStream.read(bytes))!=-1){
                bufferedOutputStream.write(bytes,0,len);//在write方法中,第一个参数时定长的数组对象,第二个参数是启始的要填入的索引值,第三个参数是从启始的索引值到目标完成的长度
            }
            System.out.println("复制完成");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
