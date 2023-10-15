package com.itheima.api_learn.math_demo;
/*
    Math类 : 数学工具类
    构造方法 : private Math(){}

    工具类设计思想:
        1.私有构造(防止外界创建对象)
        2.所有成员静态修饰

    成员方法:
        public static int abs(int a)    获取参数a的绝对值
        public static double ceil(double a) 向上取整
        public static double floor(double a) 向下取整
        public static double pow(double a,double b) 获取a的b次幂
        public static long round(double a)  四舍五入取整
 */
public class MathDemo {
    public static void main(String[] args) {
        System.out.println(Math.abs(-100));
        System.out.println(Math.ceil(12.3));
        System.out.println(Math.floor(12.6));
        System.out.println(Math.pow(2,2));
        System.out.println(Math.round(12.4));

        System.out.println(Math.random());//输出的是一个在[0,1)之间的数
    }
}
