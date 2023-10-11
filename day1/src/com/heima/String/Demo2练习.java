package com.heima.String;

import java.util.Arrays;
import java.util.Scanner;

/*
    键盘录入一个字符串,实现字符串的逆序输出
    例子:键盘录入abc,输出cba
 */
public class Demo2练习 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String s = scanner.nextLine();
        //定义一个空的字符串
        String str = "";
//        s = s.trim();
//        for (int length = s.length() - 1; length >= 0; length--) {
////            System.out.println(s.charAt(length));
//            char c = s.charAt(length);
//            str += c;
//        }
//        System.out.println(str);
        StringBuilder sb = new StringBuilder(s);
        StringBuilder reverse = sb.reverse();
        System.out.println(reverse);
        System.out.println(new StringBuilder(s).reverse().toString());
        byte[] bytes = s.getBytes();
        System.out.println(Arrays.toString(bytes));
        String s1 = new String(bytes);
        System.out.println(s1);

        //对于StringBuilder类型的变量可以通过toString()方法转换为字符串类型数据,也可以通过String(StringBuilder builder) 构造器
        //分配一个新的字符串，其中包含当前包含在字符串构建器参数中的字符序列。



    }
}
