package com.heima.finalDemo;
/*
    final修饰的类不能被继承,是一个最终的类,没有子类
    final修饰的方法也不能被重写,是一个最终的方法,不能被重写
    final修饰的变量是一个自定义常量,只能被赋值一次,不能被修改
    自定义常量命名规则:所有字母都大写,多个单词之间用下划线连接
 */
public class FinalDemo {
    public static void main(String[] args) {

    }
}

/*final*/ class Father{
    /*final*/ int num = 10;
    final int NUM;//如果final变量在创建后(初始化时)没有赋值,则只能在构造器中创建对象时赋值,不能在其他地方赋值
    //多个构造方法,那么需要多个构造方法都给final变量赋值

    public Father(int num, int num1) {
        this.num = num;
        this.NUM = num1;
    }

    public Father() {
        NUM = 20;
    }

    public /*final*/ void show(){
        num = 30;//变量在没有使用final修饰的情况下,可以被修改,但是当使用了final关键字修饰后则不能在更改变量的取值
    }
}

class Son extends Father{
    @Override
    public void show() {
        super.show();
    }
}
