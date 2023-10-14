package com.heima.interface_test2;

public class Boy extends Person{
    @Override
    public void study() {
        System.out.println("男孩爱学习,但是没有女孩学习勤奋");
    }

    public Boy() {
        super();
    }

    public Boy(String name, int age) {
        super(name, age);
    }
}
