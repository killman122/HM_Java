package com.itheima.object_stream;

import java.io.Serializable;

//注意: 对象如果要实现序列化,必须实现序列化接口,实现序列化接口Serializable的主要作用是通知虚拟机这是一个序列化的操作在这个类的对象要发生
public class User implements Serializable {
    private String loginName;
    private String userName;
    private int age;
    private transient String password;//使用transient修饰符后那么这个成员变量将不会参与序列化操作

    @Override
    public String toString() {
        return "User{" +
                "loginName='" + loginName + '\'' +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", age=" + age +
                '}';
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public User() {
    }

    public User(String loginName, String userName, String password, int age) {
        this.loginName = loginName;
        this.userName = userName;
        this.password = password;
        this.age = age;
    }
}
