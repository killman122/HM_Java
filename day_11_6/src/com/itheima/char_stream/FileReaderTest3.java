package com.itheima.char_stream;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

/*
    弄清字符输出流使用时的注意事项
    只有在关闭了输入流或者输出流后才能将数据完全写入文件中,否则写入的文件无法保存
 */
public class FileReaderTest3 {
    public static void main(String[] args) throws IOException {
        Writer fileWriter = new FileWriter("day_11_6/src/wangdao666");
        //写字符数据出去
        fileWriter.write('a');
        fileWriter.write('b');
        fileWriter.write('c');
        fileWriter.write('d');
        fileWriter.write("\r\n");

        fileWriter.write("我爱你大美人,哈哈哈");
        fileWriter.write("\r\n");
        fileWriter.write("我爱你中国");
        fileWriter.flush();//刷新流,将字符存储进文件中,注意在刷新后依旧可以使用流,但是在关闭后则无法使用流
        fileWriter.write('z');
        fileWriter.close();//关闭流,默认包含刷新流的操作
    }
}
