package com.heima.extends_demo;

public class Dog extends Animal{

    @Override
    public void eat() {
        super.eat();
        System.out.println("狗吃骨头");
    }

    public void lookHome() {
        System.out.println("看家");
    }
}
