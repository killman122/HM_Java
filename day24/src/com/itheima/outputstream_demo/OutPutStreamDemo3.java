package com.itheima.outputstream_demo;

import java.io.*;

public class OutPutStreamDemo3 {
    public static void main(String[] args) throws IOException {
        File file = new File("day24/src/com/itheima/outputstream_demo/输出流.txt");
        System.out.println(file.createNewFile());//输出是否成功创建文件
        //不关闭数据流,就没有办法关闭文件和数据流之间的关系,文件在资源管理器中就不能删除,文件会一直处于使用的状态
        // 使用try-with-resources语句自动关闭流
        try (FileOutputStream fileOutputStream = new FileOutputStream("day24/src/com/itheima/outputstream_demo/输出流.txt")) {
            fileOutputStream.write(97);
            fileOutputStream.write(99);
            fileOutputStream.write(98);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}