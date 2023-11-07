package com.itheima.char_stream;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

/*
    目标: 使用字符流进行文件的读写
 */
public class FileReaderTest1 {
    public static void main(String[] args) throws FileNotFoundException {
//        创建一个文件字符输入流管道与源文件接通
        try (Reader fileReader = new FileReader("day_11_6\\src\\wangdao")) {
            //读取文本文件的内容
            int read;//用于记录每次读取的字符的编号
            /*while ((read = fileReader.read())!= -1){//当能够读取到单个字符的时候,返回的就是单个字符的ascii码值,当不能读取到字符,比如说数据读完到空,则返回的是一个-1作为码值
//                System.out.print(read);
                System.out.print((char) read);//使用文件字符输入流实现了文件的不限读取长度,且不会乱码
                //为什么文件字符输入流读取不会产生乱码但是字节输入流读取文件FileInputStream会出现乱码,只要文件中的编码格式和文件字符输入流中的编码格式一致,就能够将文件字符中的数据读取
            }//但是使用单个字符的读入对于性能来说是比较差的,当文件占的空间越大时,调用的次数会越多影响性能*/
            //使用字符数组读取多个字符每次
            char[] buffer = new char[3];
            int len;//记录每次读取了多少个字符,防止由于不够读取的3的长度而使用空来填充
            while ((len = fileReader.read(buffer))!= -1){//虽然这里的数据也是和-1进行比较,但是上下文的含义不同
//                System.out.print((char) len);//如果在read()方法中不填写参数,那么在调用的时候就不会使用固定的字长读取,所以和直接使用read()的上面的方法的输出一致,但是如果填写字节长度的限制后,输出的值就不在相同
                System.out.println(new String(buffer, 0, len));//读取多少就输出多少
            }//在使用多个字符的读取中,对于性能是不错的
        }// 使用多态的方式进行文件字符输入流对象的创建与引用,使用try-catch-resource的方式能够自动关闭输入流和输出流
        catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
