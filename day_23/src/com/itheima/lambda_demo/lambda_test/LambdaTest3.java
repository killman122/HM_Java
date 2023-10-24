package com.itheima.lambda_demo.lambda_test;

import java.util.Random;

/*
    首先存在一个接口（RandomNumHandler）
    在该接口中存在一个抽象方法（getNumber），该方法是无参数但是有返回值
    在测试类（RandomNumHandlerDemo）中存在一个方法（useRandomNumHandler），方法的的参数是RandomNumHandler类型的，在方法内部调用了RandomNumHandler的getNumber方法

 */
public class LambdaTest3 {
    public static void main(String[] args) {
//        Random random = new Random();
//        random.nextInt(100);
        useRandomNumHandler(()-> new Random().nextInt(100));//调用下面的静态方法useRandomNumHandler,并重写接口中的抽象方法,并传入一个通过匿名对象的方式调用,但是在某些情况下,容易区分不出对象
    }
    public static void useRandomNumHandler(RandomNumHandler randomNumHandler){
        System.out.println(randomNumHandler.getNumber());//抽象方法的调用并输出返回值
    }
}
@FunctionalInterface
interface RandomNumHandler{
    int getNumber();//定义抽象方法，无参数但是有返回值,返回值是一个int类型数据
}
