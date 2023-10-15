package com.heima.多态;
/*
    多态的成员访问特点:
        成员变量: 编译看左边(父类), 运行看左边(父类)
        成员方法: 编译看左边(父类), 运行看右边(子类),如果右边没有,那么会继承左边的父类中的成员方法
        静态方法: 编译看左边, 运行看左边
 */
public class Demo1 {
    public static void main(String[] args) {
        Son son = new Son();
        Father father = new Son();
        //s.a;//这里是不能访问的,因为父类中没有a这个成员变量,在使用多态的父类引用子类对象后,似乎子类的成员属性和成员方法都被父类覆盖率
        System.out.println(father.num);//这里是可以访问的,因为父类中有num这个成员变量
        father.method();//这里是可以访问的,执行了重写后的子类中的show()方法
        father.method1();//这里是可以访问的,因为父类中有method1()方法,可以发现对于成员方法来说,运行的时候似乎是优先看子类,子类中没有才看父类,因为子类可以继承父类的方法,所以这里是可以访问的
        Father.show();
        father.show();//这里是可以访问的,因为静态方法是编译看左边,运行看左边,所以这里是可以访问的,但是一般静态方法通过类名调用,不建议通过对象名调用
    }
}

class Father {
    int num = 10;

    public void method() {
        System.out.println("Father method");
    }
    public void method1(){
        System.out.println("Father method1");
    }

    public static void show() {
        System.out.println("Father static show");
    }
}

class Son extends Father {
    int a = 10;
    int b = 20;
    @Override
    public void method() {
        System.out.println("Son method");//这里是重写了父类中的方法,但是重写
        //子类中的method()方法,但是没有使用Overwrite关键字,所以这里的
    }

}