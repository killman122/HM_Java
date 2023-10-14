package com.heima.interface_test2;

public class PlayBoy extends Boy implements Play{
    public PlayBoy() {
    }

    public PlayBoy(String name, int age) {
        super(name, age);
    }

    @Override
    public void playBasketBall() {
        System.out.println("男孩爱打篮球");
    }
}
