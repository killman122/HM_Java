package com.heima._02分支结构;

import java.util.Scanner;

/*
    switch语句
        格式:
            switch(值){
                case 值: 语句体1;break;
                case 值: 语句体2;break;
                case 值: 语句体3;break;
                case 值: 语句体4;break;
                case 值: 语句体5;break;
                case 值: 语句体6;break;
                ....
                default: 语句体n+1;break;
            }
            获取switch后面值和case语句后面的值进行匹配,匹配上就执行语句体,如果都不匹配执行default语句
 */
public class Demo1switch {
    public static void main(String[] args) {
//        减肥计划  周一跑步    周二游泳    周三动感单车  周四爬山    周五跳绳    周六SPA   周日吃顿好的
//        键盘录入信息查看减肥计划
        System.out.println("请输入你要查看的星期数,使用阿拉伯数字表示");
        Scanner scanner = new Scanner(System.in);
        int week = scanner.nextInt();
//      使用switch语句查看减肥计划
        switch (week) {
            case 1:
                System.out.println("周一跑步");
                break;
            case 2:
                System.out.println("周二游泳");
                break;
            case 3:
                System.out.println("周三动感单车");
                break;
            case 4:
                System.out.println("周四爬山");
                break;
            case 5:
                System.out.println("周五跳绳");
                break;
            case 6:
                System.out.println("周六SQA");
                break;
            case 7:
                System.out.println("周天吃大餐");
                break;
            default:
                System.out.println("你输入的信息不存在,请按照要求输入");
        }
    }
}
