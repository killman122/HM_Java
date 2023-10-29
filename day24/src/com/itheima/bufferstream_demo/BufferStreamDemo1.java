package com.itheima.bufferstream_demo;

import java.io.*;

/*
    字节缓冲流:
        BufferOutputStream:缓冲输出流
        BufferedInputStream:缓冲输入流
    构造方法:
        字节缓冲输出流: BufferedOutputStream(OutputStream out)//需要传入一个OutputStream对象,但是由于是抽象类无法创建对象,所以找它的子类FileOutputStream
        字节缓冲输入流: BufferedInputStream(InputStream in)//需要传入一个InputStream对象,但是由于是抽象类无法创建对象,所以找它的子类FileInputStream
    为什么构造方法需要的是字节流，而不是具体的文件或者路径呢?
    字节缓冲流仅仅提供缓冲区，不具备读写功能 ，而真正的读写数据还得依靠基本的字节流对象进行操作
    需求 : 使用缓冲流进行复制文件
    数据源 : D:\传智播客\安装包\好看的图片\Liqin2.jpg
    目的地:day11_demo\copy.jpg

 */
public class BufferStreamDemo1 {
    public static void main(String[] args) throws FileNotFoundException {
        //创建缓冲输出流,并抛出异常,将创建的FileOutputStream对象传入,注意路径中的路径分隔符\\,使用自动关闭with所以,将流的创建写在try中
//        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("C:\\Users\\24834\\Pictures\\quiet.jpg"));
        //创建缓冲输入流,并抛出异常,将创建的FileInputStream对象传入,通过查看类图中的函数,可以得知需要填写什么参数,调用什么方法可以读取到数据
        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream("C:\\Users\\24834\\Pictures\\quiet.jpg")); BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("day24/src/com/itheima/bufferstream_demo/copy.jpg"))) {
            //基本的字节流一次读写一个字节


            //一次读写一个字节数组


            // 缓冲流一次读写一个字节
            /*int by;
            while ((by = bis.read()) != -1) {
                bos.write(by);
            }*/
            //缓冲流一次读写一个字节数组
            byte[] bys = new byte[1024];
            int len;//记录的是每次真实读到的数据的个数abc则为3
            while ((len = bis.read(bys)) != -1) {
                bos.write(bys, 0, len);
            }
        } catch (IOException e) {//由于在这里使用了try-with-resource语句,所以不需要手动关闭流
            e.printStackTrace();
        }
    }
}
