package com.itheima.myexception_demo;
/*
    需求: 设计一个方法,接收一个年龄(0-150),判断是否满足年龄要求,不满足要求范围的,则抛出一个自定义异常
 */
public class MyExceptionDemo {
    public static void main(String[] args) {
        checkAge(160);
    }

    public static void checkAge(int age) {
        if (age < 0 || age > 150) {
            throw new AgeOutBoundsException("年龄不合法");//抛出自定义异常对象,其中的参数就是指定的异常的原因,在自定义异常类中由自定义异常类中的构造器决定
        }
        System.out.println("年龄为"+age);
    }
}
