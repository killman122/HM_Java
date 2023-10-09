package com.heima._02类型转换和运算符;

//导入扫描器的包
import java.util.Scanner;
public class Demo4键盘录入 {
    public static void main(String[] args) {
        //创建扫描器对象
        Scanner scanner = new Scanner(System.in);
        //调用扫描器对象的方法,接收键盘录入的数据,这里接收的数据是int类型数据
        scanner.nextInt();
    }
}
