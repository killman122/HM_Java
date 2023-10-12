package com.heima.extends继承学习;

public class Students {
    String name;
    int age;
    String sex;
    String stuId;

    public void eat(){
        System.out.println("吃饭");
    }
    public void study(){
        System.out.println("学习");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getStuId() {
        return stuId;
    }

    public void setStuId(String stuId) {
        this.stuId = stuId;
    }

    public Students() {
    }

    public Students(String name, int age, String sex, String stuId) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.stuId = stuId;
    }
}
