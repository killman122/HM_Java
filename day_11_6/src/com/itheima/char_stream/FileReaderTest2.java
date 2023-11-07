package com.itheima.char_stream;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

/*
    目标: 掌握文件字符输出流,写字符数据
 */
public class FileReaderTest2 {
    public static void main(String[] args) {
        //创建一个文件字符输出流管道与目标文件接通
        try(Writer fileWriter = new FileWriter("day_11_6/src/wangsansi")){//可以将文件字符输出流的管道构造器第二个参数append设置为true,可以实现在原有文件中追加数据

            //public void write(int c): 写一个字符出去
            fileWriter.write('a');
            fileWriter.write(98);
            fileWriter.write('字');
            //public void write(String c): 写一个字符串出去
            fileWriter.write("字长为字符串");
            //public void write(String c,int pos,int len): 写字符串的一部分出去
            fileWriter.write("我爱你大美人666",0,6);//从字符串中的第一个字符开始写入,写入6个字长的字符串
            //public void write(char[] buffer): 写一个字符数组出去
            char[] buffer = {'a','b','c','d','黑','马'};
            fileWriter.write(buffer);
            //public void write(char[] buffer,int pos,int len): 写字符数组的一部分出去
            fileWriter.write("\r\n");//实现了写入文件时的换行操作
            fileWriter.write(buffer, 4, 2);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}
