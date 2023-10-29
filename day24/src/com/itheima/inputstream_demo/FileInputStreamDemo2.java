package com.itheima.inputstream_demo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
    需求：把“xxx.jpg”复制到当前分析：

①复制文件，其实就把文件的内容从一个文件中读取出来(**数据源**)，然后写入到另一个文件中(**目的地**)

②数据源：

xxx.jpg --- 读数据 --- FileInputStream

③目的地：

模块名称\\copy.jpg --- 写数据 --- FileOutputStream模块下

数据源: "C:\Users\24834\Pictures\Magisk.png"
目的地: "day24/src/com/itheima/inputstream_demo/copy.png"
 */
public class FileInputStreamDemo2 {
    public static void main(String[] args) throws IOException {
        //首先读数据,不需要写数据,所以不需要创建FileOutputStream对象,直接创建FileInputStream对象
        FileInputStream inputStream = new FileInputStream("C:\\Users\\24834\\Pictures\\Magisk.png");
//        System.out.println(inputStream.read());
        //其次写数据,需要一个FileOutputStream对象,当然也可以使用File类创建一个文件或者文件夹对象,也可以使用默认的FileOutputStream类对象直接在写入数据的时候添加数据
        FileOutputStream fileOutputStream = new FileOutputStream("day24/src/com/itheima/inputstream_demo/copy.png");
        int read;
        //一次读写一个字节
        while ((read = inputStream.read()) != -1){
            fileOutputStream.write(read);
        }
        //释放资源
        fileOutputStream.close();
        inputStream.close();
    }
}
