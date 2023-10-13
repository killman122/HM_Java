package com.heima.abstract_demo.test;

public class Dog extends Animal {
    //通过重写抽象类中的抽象方法的方式避免了将子类定义为抽象类,因为子类一旦定义为抽象类,子类中就不能创建对象实例化,一个不能实例化的类有什么用?
    @Override
    void eat() {
        System.out.println("狗吃肉");
    }

    public Dog() {
    }
    //如果想要避免在子类中重复定义构造函数,可以通过super关键字调用父类的构造函数,但是还是需要在父类中定义构造函数,并且子类中也要写构造函数,只是省略了this的成员变量赋值的阶段
    public Dog(String name, String breed) {
        super(name, breed);
    }
}
