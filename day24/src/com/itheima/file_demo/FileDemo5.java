package com.itheima.file_demo;

import java.io.File;

/*
    FiLe类高级获取功能
    public File[] listFiles()返回此抽象路径名表示的目录中的文件和目录的Fie对象数组
    ListFiles方法注意事项:
        1当调用者不存在时，返回null,也就是说File类数组中返回的是一个null,如果在使用后面的增强for循环的方式遍历,则返回一个空指针异常的错误
        2当调用齐是一个文件时，返同null,也就是说File类数组中返回的是一个null,如果在使用后面的增强for循环的方式遍历,则返回一个空指针异常的错误
        3 当调用者是一个空文件火时，返回一个长度为0的数组
        4 当调用者是一个有内容的文件夹时，将里面所有文件和文件夹的路径放在Fire数组中返回 ，拿到儿子辈的文件 ，包含隐藏内容
 */
public class FileDemo5 {
    public static void main(String[] args) {
        File[] files = new File("D:\\IdeaProject\\HM_Java\\day24\\src\\com\\itheima\\file_demo").listFiles();//如果使用list()方法则返回值为String类型的数组,并且返回的是路径名对象
        for (File file : files) {
            System.out.println(file);//遍历数组,输出所有在文件列表中的文件名
        }
    }
}