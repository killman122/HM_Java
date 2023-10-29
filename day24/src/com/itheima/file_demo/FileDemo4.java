package com.itheima.file_demo;

import java.io.File;

/*
    Fie类判断和获取功能
    public boolean isDirectory(测试此抽象路径名表示的File是否为日录
    public boolean isFile() 测试此抽象路径名表示的File是否为文件
    public boolean exists() 测试此抽象路径名表示的FiLe是否存在
    public string getAbsolutePath() 返回此抽象路径名的绝对路径名字符串
    public string getPath() 获取的是创建File对象给定的路径
    public string getName() 返回由此抽象路径名表示的文件或目录的名称
 */
public class FileDemo4 {
    public static void main(String[] args) {
        System.out.println(new File("D:\\IdeaProject\\HM_Java\\day24\\src\\com\\itheima\\file_demo\\b").isDirectory());
        System.out.println(new File("D:\\IdeaProject\\HM_Java\\day24\\src\\com\\itheima\\file_demo\\b").isFile());
        System.out.println(new File("D:\\IdeaProject\\HM_Java\\day24\\src\\com\\itheima\\file_demo\\b").exists());
        System.out.println(new File("D:\\IdeaProject\\HM_Java\\day24\\src\\com\\itheima\\file_demo\\b").getAbsolutePath());
        System.out.println(new File("D:\\IdeaProject\\HM_Java\\day24\\src\\com\\itheima\\file_demo\\b").getName());
        System.out.println(new File("D:\\IdeaProject\\HM_Java\\day24\\src\\com\\itheima\\file_demo\\b").getPath());
        System.out.println(new File("D:\\IdeaProject\\HM_Java\\day24\\src\\com\\itheima\\file_demo\\b").isHidden());
    }
}
