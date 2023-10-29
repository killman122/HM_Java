package com.itheima.outputstream_demo;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.TransferQueue;

/*
    字节流写数据的换行和追加写入
    字节流写数据如何实现换行呢?
    写完数据后，加换行符
    windows :\r\n
    Linux : \n
    mac : \r
    字节流写数据如何实现追加写入呢?
    通过构造方法: public FileOutputStream(String name，boolean append)创建文件输出流以指定的名称写入文件。
    如果第二个参数为true ，不会清空文件里面的内容，追加写数据

    另外需要注意的是在使用FileOutputStream类创建的字节流中,如果写入后都是相当于将所有的文本删除后重新写入,就和python中的w写入模式一样,如果是需要追加,在python中可以加上a关键字
 */
public class OutputStreamDemo1 {
    public static void main(String[] args) throws IOException {
        //创建字节输出流对象
        FileOutputStream outputStream = new FileOutputStream("day24/src/com/itheima/outputstream_demo/输出流.txt", true);
        //写数据
        outputStream.write("你好牛逼".getBytes());
        for (int i = 0; i < 10; i++) {
            outputStream.write("你好牛逼".getBytes());
            outputStream.write("\r\n".getBytes());
        }//如果不添加换行符在代码中,在写入文件后,所有的文字都是占据在一行
        //释放资源,调用close()方法关闭字节输出流
        outputStream.close();
    }
}
