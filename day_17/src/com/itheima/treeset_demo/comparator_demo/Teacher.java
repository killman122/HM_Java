package com.itheima.treeset_demo.comparator_demo;

public class Teacher {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Teacher(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Teacher() {
    }
}
