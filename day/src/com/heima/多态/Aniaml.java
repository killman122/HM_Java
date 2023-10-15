package com.heima.多态;

public abstract class Aniaml {
    public abstract void eat();
}

class Dog1 extends Aniaml {
    @Override
    public void eat() {
        System.out.println("狗吃骨头");
    }

    public void lookHome() {
        System.out.println("狗看家..");
    }
}

class Cat1 extends Aniaml {
    //重写父类方法
    @Override
    public void eat() {
        System.out.println("猫吃鱼");
    }

    public void catchMouse() {
        System.out.println("猫抓老鼠");
    }
}

class Pig extends Aniaml {
    @Override
    public void eat() {
        System.out.println("猪吃白菜");
    }

    public void gongDi() {
        System.out.println("猪拱地");
    }
}