package com.heima._02分支结构;

import java.util.Scanner;
/*
分析:
    1.键盘键入
        导包
        创建对象
        接收数据
    2.获取接收的数据
        使用switch语句匹配,输出对应的季节
    3.case语句具有穿透性,遇到break才停止
    switch后面小括号,只能放置byte short int char String  enum()
 */
public class Demo2switch练习 {
    //定义一个静态的常量,常量的数值在之后的使用中不会发生变动
    static final double PI = 3.14;
    public static void main(String[] args) {
        System.out.println(PI);
        //创建对象扫描器
        Scanner scanner = new Scanner(System.in);
//      请输入一个月份,用来判断并输出相应的季节
        System.out.println("请输入一个月份");
        int month = scanner.nextInt();
        switch (month){
            case 12:
            case 1:
            case 2: System.out.println("冬季");break;
            case 3:
//            case 3: System.out.println("春季");break;
            case 4:
//            case 4: System.out.println("春季");break;
            case 5: System.out.println("春季");break;
            case 6:
//            case 6: System.out.println("夏季");break;
            case 7:
//            case 7: System.out.println("夏季");break;
            case 8: System.out.println("夏季");break;
            case 9:
//            case 9: System.out.println("秋季");break;
            case 10:
//            case 10: System.out.println("秋季");break;
            case 11: System.out.println("秋季");break;
            default:
                System.out.println("不存在当前月份");
        }
    }
};


//为枚举类型常量设置,一般需要对这个常量大写,枚举类型在python和mysql中sql语法也会出现
enum WEEK{
    MONDAY,SUNDAY
}
