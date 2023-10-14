package com.heima.interface_test2;

public class PlayGirl extends Girl implements Play{
    @Override
    public void playBasketBall() {
        System.out.println("女孩爱打篮球");
    }

    public PlayGirl() {
    }

    public PlayGirl(String name, int age) {
        super(name, age);
    }
}
