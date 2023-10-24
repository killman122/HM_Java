package com.itheima.lambda_demo.lambda_test;
/*
    Lambda表达式的使用前提
    - 有一个接口
    - 接口中有且仅有一个抽象方法需要被重写

练习1：

1. 编写一个接口（ShowHandler）
2. 在该接口中存在一个抽象方法（show），该方法是无参数无返回值
3. 在测试类（ShowHandlerDemo）中存在一个方法（useShowHandler），方法的的参数是ShowHandler类型的，在方法内部调用了ShowHandler的show方法
 */
public class LambdaTest1 {
    public static void main(String[] args) {
        ShowHandlerDemo demo = new ShowHandlerDemo();
        demo.useShowHandler(()->{System.out.println("我会游泳");});//相当于在匿名内部类中调用重写接口的show方法,传递lambda表达式,实现ShowHandler接口
    }
}
@FunctionalInterface
interface ShowHandler{
    void show();//函数式接口的抽象方法
}

class ShowHandlerDemo{
    //可以将useShowHandler方法中直接写在public主类中,这样在调用时,默认使用的是主类对象直接.方法名的方式调用,但是在显示的调用上为方法名()
    public void useShowHandler(ShowHandler showHandler){//多态方式传递接口的引用给父类接口类,接收ShowHandler对象作为方法参数
        showHandler.show();//调用接口方法
    }
}