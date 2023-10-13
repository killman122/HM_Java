package com.heima.abstract_demo;

public class AbstractDemo {
    public static void main(String[] args) {
//        Animal animal = new Animal();
    }
}

class Dog extends Animal {
    @Override
    public void look() {
        System.out.println("狗看家");
    }
}

//如果类中存在了抽象方法,那么子类是一个抽象类
abstract class Animal {
    //在Java中一个方法要么有方法体,要么此方法是抽象方法
    public abstract void look();
    //抽象方法需要使用关键字"abstract"修饰
    //抽象方法不能有方法体
    public void eat() {
        System.out.println("eat");
    }
}