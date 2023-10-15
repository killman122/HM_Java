package com.heima.多态;
/*
    __多态__: 同一个对象在不同时刻表现出来的不同形态
    多态的前提和体现
    - 有继承/实现关系
    - 有方法重写
    - 有父类引用执行子类对象
 */
public class Demo {
    public static void main(String[] args) {
        Dog1 animal = new Dog1();//多态的体现:父类引用指向子类对象
        animal.eat();//狗吃骨头
    }
}

abstract class Animal{//所有的动物都具有吃的功能,但是每个动物对于吃的功能的实现不一样,所以将这个类作为抽象类,将吃的方法定义为一个抽象方法实现规则
    public abstract void eat();
}

class Dog extends Animal{
    @Override
    public void eat() {
        System.out.println("狗吃骨头");
    }
}

class Cat extends Animal{

    @Override
    public void eat() {
        System.out.println("猫吃鱼");
    }
}