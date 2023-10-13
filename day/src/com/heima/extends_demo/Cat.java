package com.heima.extends_demo;

public class Cat extends Animal {
    public Cat() {
        //访问构造方法的格式,必须要在构造方法中完成
    }

    public Cat(String color, String brand, int age) {
        super(color, brand, age);//通过调用父类的有参构造器,可以直接设置属性值,由于继承的特性,子类可以直接使用父类的属性和方法
    }

    @Override
    public void eat() {
        System.out.println("猫吃鱼");
    }

    public void catchMouse() {
        System.out.println("抓老鼠");
    }
}
