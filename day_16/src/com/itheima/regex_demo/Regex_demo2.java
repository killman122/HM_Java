package com.itheima.regex_demo;

public class Regex_demo2 {
    public static void main(String[] args) {
        //验证str是否是3位数字
        System.out.println("".matches("\\d{3}"));
        //验证str 是否是多位数字
        System.out.println("".matches("\\d+"));
        //1. 验证str 是否是手机号(1开头,第二位:3/5/8,剩下九位都是0~9的数字)
        System.out.println("".matches("1[358]\\d{9}"));
        //2. 验证QQ号码:1. 5--15位字符 2. 全部是数字 3. 第一位不是 0
        System.out.println("2483483884".matches("[1-9]\\d{4,14}"));
    }
}
