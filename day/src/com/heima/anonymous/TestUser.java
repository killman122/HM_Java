package com.heima.anonymous;

import java.util.ArrayList;
import java.util.Scanner;

public class TestUser {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //创建集合对象
        ArrayList<Object> list = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            System.out.println("请输入第"+(i+1)+"个用户的用户名:");
            String username = sc.next();
            System.out.println("请输入第"+(i+1)+"个用户的密码:");
            String password = sc.next();
            System.out.println("请输入第"+(i+1)+"个用户的确认密码:");
            String confirm = sc.next();
            if (password.equals(confirm)) {
                System.out.println("请输入第"+(i+1)+"个用户的电话号码:");
                String phoneNumber = sc.next();
                System.out.println("请输入第"+(i+1)+"个用户的电子邮件:");
                String email = sc.next();
                System.out.println("请输入第"+(i+1)+"个用户的性别:");
                String sex = sc.next();
                System.out.println("请输入第"+(i+1)+"个用户的生日:");
                String birthday = sc.next();
                System.out.println("注册成功");
                //创建User对象
                User user = new User(username,password,phoneNumber,confirm,email,sex,birthday);
                //将User对象添加到集合中
                list.add(user);
            }else{
                System.out.println("输入密码有误,请重新输入");
                i--;
//                return;

            }
        }
        System.out.println(list);

    }
}
