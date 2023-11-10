package com.itheima.commons_io;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

/*
    使用Commons-io框架实现IO的相关操作
 */
public class CommonsIoTest {
    public static void main(String[] args) throws IOException {
        FileUtils.copyFile(new File("day_11_6/src/wangdao777.txt"), new File("day_11_6/src/wanghouxing.txt"));//拷贝文件
        FileUtils.copyDirectory(new File("day_11_6/src/com/itheima"), new File("day_11_6/src/com/itheima2"));//拷贝文件夹
        FileUtils.deleteDirectory(new File("day_11_6/src/com/itheima2"));//删除文件夹

        //Java提供的原生一行代码注释
//        Files.copy()
        Files.copy(new File("day_11_6/src/wangdao777.txt").toPath(), new File("day_11_6/src/wanghouxing.txt").toPath());//拷贝文件
        Files.copy(Path.of("day_11_6/src/wangdao777.txt"), Path.of("day_11_6/src/wanghouxing.txt"));//拷贝文件
    }
}
