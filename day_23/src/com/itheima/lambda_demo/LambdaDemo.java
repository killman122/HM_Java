package com.itheima.lambda_demo;
/*
    lambda表达式体验:
 */
public class LambdaDemo {//在一个.Java文件中,一个文件中只能出现一个public
    public static void main(String[] args) {
        userSwimming(new Swimming() {//使用匿名内部类的方式传入接口的实现类,就不需要写一个带有名实现类,但是一个有名实现类也可以使用多态的方式传递接口的引用
            @Override
            public void swim() {
                System.out.println("使用匿名内部类方式打印我会游泳");
            }
        });
        System.out.println("======================");
        userSwimming(()->{System.out.println("使用lambda表达式方式打印我会游泳");});//对这里的lambda表达式很眼熟,嗯和JavaScript中的lambda表达式基本一样()=>{...}这是javascript中的lambda表达式
    }
    //传入接口的实现类引用,本来是可以将匿名内部类和lambda表达式一起卸载参数中直接在下面的函数中使用,但是为了便于学习,将表达式和函数拆出形成两个独立的部分
    public static void userSwimming(Swimming swimmer){//多态的实例,接口本身不能被实例化,由于没有构造方法,但是可以声明一个接口的引用变量,使得引用变量指向实现该接口的任何对象,Swimming swimmer这一行代码就是在声明一个接口的引用变量swimmer，它指向实现了Swimming接口的对象
        //接口引用的一个重要特性是，通过接口引用，我们只能调用在接口中定义的方法，即使引用指向的实际对象具有更多的方法
        //形参swimmer接收了匿名内部类对象,多态的表现,编译看左边,执行看右边,由于子类实现了接口,所以继承接口中的方法并重写调用子类中的重写的方法
        swimmer.swim();

    }
}
interface Swimming{
//    public static final String name = null;//定义一个静态常量
    public abstract void swim();//定义一个抽象方法,默认情况下添加了关键字public abstract,可以省略,但是其中的成员变量一般是public static final 静态常量修饰
}
