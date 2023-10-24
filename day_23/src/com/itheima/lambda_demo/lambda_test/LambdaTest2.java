package com.itheima.lambda_demo.lambda_test;
/*

首先存在一个接口（StringHandler）
在该接口中存在一个抽象方法（printMessage），该方法是有参数无返回值
在测试类（StringHandlerDemo）中存在一个方法（useStringHandler），方法的的参数是StringHandler类型的，在方法内部调用了StringHandler的printMessage方法

 */
public class LambdaTest2 {
    public static void main(String[] args) {
        StringHandlerDemo demo = new StringHandlerDemo();
        //使用匿名函数的方式实现父类接口中的方法
//        demo.useStringHandler(new StringHandler() {
//            @Override
//            public void printMessage(String message) {
//                System.out.println("匿名函数中重写接口中的方法,并通过测试类传入参数,在通过public主类中创建测试类对象并调用"+message);
//            }
//        });
        //使用lambda表达式的方式实现父类接口中的方法
//        demo.useStringHandler((String message)->{System.out.println("匿名函数中重写接口中的方法,并通过测试类传入参数,在通过public主类中创建测试类对象并调用");});

    }
}

@FunctionalInterface
 interface StringHandler{
    void printMessage(String message);//抽象方法，无参数无返回值
 }

 class StringHandlerDemo{
    public void useStringHandler(StringHandler stringHandler){//多态的体现,引用的传递,将参数传递给了匿名函数中重写的方法
        stringHandler.printMessage("我会打印");
    }
 }