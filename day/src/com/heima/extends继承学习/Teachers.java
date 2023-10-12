package com.heima.extends继承学习;

public class Teachers {
    String name;
    int age;
    String teachID;
    String sex;
    public void eat(){

    }
    public void teach(){

    }

    public Teachers() {
    }

    public Teachers(String name, int age, String teachID, String sex) {
        this.name = name;
        this.age = age;
        this.teachID = teachID;
        this.sex = sex;
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

    public String getTeachID() {
        return teachID;
    }

    public void setTeachID(String teachID) {
        this.teachID = teachID;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
