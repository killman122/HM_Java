package com.heima.ArrayList集合入门;

public class Student {
    private String stuId;
    private String name;
    private String sex;
    private int age;
    private String address;
    private double score;

    public Student() {
    }

    public Student(String stuId, String name, String sex, int age, String address, double score) {
        this.stuId = stuId;
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.address = address;
        this.score = score;
    }

    public String getStuId() {
        return stuId;
    }

    public void setStuId(String stuId) {
        this.stuId = stuId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }
}
