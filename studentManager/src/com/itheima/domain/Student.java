package com.itheima.domain;

public class Student {
    private String id;
    private String name;
    private String gender;
    private int age;
    private String birthday;

    public Student() {
    }

    public Student(String id, String name, String gender, int age, String birthday) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.birthday = birthday;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }
}
