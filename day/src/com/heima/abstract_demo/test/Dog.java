package com.heima.abstract_demo.test;

public class Dog extends Animal {
    //通过重写抽象类中的抽象方法的方式避免了将子类定义为抽象类,因为子类一旦定义为抽象类,子类中就不能创建对象实例化,一个不能实例化的类有什么用?
    @Override
    void eat() {
        System.out.println("狗吃肉");
    }
}
