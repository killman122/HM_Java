package com.heima.String;

import java.util.Scanner;

/*
    从键盘中输入一个手机号码,屏蔽手机号码的中间4位数字
    159[2494]0813==========>159xxxx0813
 */
public class 练习手机号的加密 {
    public static void main(String[] args) {
        //键盘录入
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个手机号:");
        String phoneNum = scanner.nextLine();
        //使用字符串截取的方法
        int length = phoneNum.length();
        String xx = phoneNum.substring(3, length - 4);
//        System.out.println(xx);
        String xxxx = phoneNum.replace(xx, "xxxx");
        System.out.println(xxxx);

    }
}
