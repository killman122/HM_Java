package com.heima.abstract_demo.test;

public class AnimalTest {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        dog.eat();
        cat.eat();
        dog.drink();
        cat.drink();
        dog.setName("旺财");
        cat.setName("加菲");
        //new Animal();//抽象类不能实例化,但是为什么要在抽象类中写构造函数
    }
}
