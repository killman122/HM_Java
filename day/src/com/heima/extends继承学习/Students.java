package com.heima.extends继承学习;

public class Students extends Person{
    private String id;

    public Students() {
    }

    public Students(String name, int age, String id) {
        super(name, age);
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void study() {
        System.out.println(getName());
        System.out.println("学习...");
    }
}
