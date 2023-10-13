package com.heima.extends_demo;

public class Animal {
    String color;
    String brand;
    int age;
    public void eat() {
        System.out.println("吃饭");
    }
    public void drink() {
        System.out.println("喝水");
    }

    public Animal() {
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Animal(String color, String brand, int age) {
        this.color = color;
        this.brand = brand;
        this.age = age;
    }
}
