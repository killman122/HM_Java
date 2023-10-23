package com.itheima.lambda_demo;
/*
    函数式接口 : 只有一个抽象方法需要重写的接口,称为函数式接口
    接口中有且只有一个抽象方法的接口,就是函数式接口: 错误❌
 */
public class FunctionalDemo {
    public static void main(String[] args) {

    }
}
@FunctionalInterface
interface Swim{
    public abstract void swim();//函数式接口可以使用在抽象方法外
//    public abstract void swim();//只有一个抽象方法需要被重写才能使用函数式接口FunctionalInterface
    public default void swimDefault(){   };
    public static void show(){
        //...
    };
}

class SwimImpl implements Swim{
    @Override
    public void swim() {
        System.out.println("我会游泳");
    }
}