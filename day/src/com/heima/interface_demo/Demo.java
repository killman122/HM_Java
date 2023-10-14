package com.heima.interface_demo;
/*
    - 接口用关键字interface类定义
  - public interface 接口名 { }
- 接口不能实例化(不能创建对象,不能使用new()方法)
- 类与接口之间是实现关系,通过implements关键字表示
  - public class 类名 implements 接口名 {}
- 接口的子类(实现类)
  - 要么重写接口中的所有抽象方法
  - 要么是抽象类
 */
public class Demo{
    public static void main(String[] args) {
        /*Inter inter = new Inter();
        接口不能通过对象的实例化方式进行实现
        'Inter' 为 abstract；无法实例化
        应为 ';'*/
    }
}

interface InterP{
    //抽象方法
    public abstract void show();
    void watch();//省略public abstract默认修饰符
}