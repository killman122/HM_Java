package com.heima.类;

public class Demo1学生类 {
    //成员变量
    String name;
    int age;
    //成员方法  行为
    public void study(){
        System.out.println("好好学习,天天向上");
    }

    public static void main(String[] args) {
        Demo1学生类 学生 = new Demo1学生类();
        //使用成员方法,也就是调用类中的成员函数
        学生.study();
        System.out.println(学生);// 类 接口 数组 都是引用数据类型 @1b6d3586 输出的引用数据类型的地址
        //对象的使用,设置对象的成员变量也就是对象的属性的值
        学生.name = "正三";
        学生.age = 18;
        //com.heima.类.Demo1 : 包名+类名 称为: 全类名
        //@ : 分割符
        //1b6d3586 : 十六进制的内存地址,使用16进制能够占更少的位数   一个16进制换为2进制就是4位 如果将这些数都转换为2进制的数据存储需要的存储地址的空间更大

//        对象的取值     对象的属性/成员变量的数据类型是什么,那么在接收创建的对象的成员变量时就要返回什么数据
        String Name = 学生.name;
        System.out.println("姓名"+Name);
        int Age = 学生.age;
        System.out.printf("年龄"+Age);
    }
}
