package com.heima.类;
/*
    需求: 首先定义一个手机类,然后定义一个手机测试类,在手机测试类中通过对象完成成员变量和成员方法的使用
 */
public class Phone {
    //成员变量
    String brand;
    double price;
    //成员方法
    public void call(){
        System.out.println("正在使用价格为"+price+"元的"+brand+"手机打电话");
    }
    public void sendMessage(){
        System.out.println("正在使用价格为"+price+"元的"+brand+"手机发短信");
    }
}
