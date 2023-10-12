package com.heima.类;

public class Student {
    private String name;
    /**
     * private:
     *  表示私有的,外界不能直接访问,只能在本类中访问,但是可以留下set/get的接口使得外部的类可以间接的调用
     */
    private int age;

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public void study(){
        System.out.println("好好学习,天天向上");
    }
    public void eat(){
        System.out.println("干饭人,干饭魂,干饭都是人上人");
    }
    public void sleep(){
        System.out.println("单生狗,自己睡觉,自己起床,自己干活");
    }
}
