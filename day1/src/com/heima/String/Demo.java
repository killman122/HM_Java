package com.heima.String;

import java.util.Scanner;

/*
    模拟用户登录
 */
public class Demo {
    public static void main(String[] args) {
        String username = "admin";
        String password = "123456";
        //键盘录入
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入用户名");
        String userName = scanner.nextLine();
        System.out.println("请输入密码");
        String passWord = scanner.nextLine();
        if (userName.equals(username)){//这里也可以改为逻辑运算符&&,这样如果第一个条件不合适则不会在判断第二个条件
            if (passWord.equals(password))
                System.out.println("登录成功");
        }else {
            System.out.println("登录失败");
        }
    //String trim() 返回一个字符串，其值为此字符串，并删除任何前导和尾随空格。
    }
}
