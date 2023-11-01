package com.heima.interface_test2;

public class Girl extends Person{
    public Girl(String name, int age) {
        super(name, age);
    }

    public Girl() {
        super();
    }

    @Override
    public void study() {
        System.out.println("女孩爱学习");
    }
}
