package com.itheima.genericity_demo.set_demo;
/*
    哈希值:是JDK根据对象的地址或者对象的属性算出来的int类型的数值
    object类中有一个方法可以获取对象的哈希值
        1 public int hashCode():返回对象的哈希码值
    对象的哈希值特点
        1 同一个对象多次调用hashCode()方法返回的哈希值是相同的
        2 默认情况下，不同对象的哈希值是不同的。而重写hashCode()方法，不同对象的哈希值是有可能相同的
 */
public class Person {
    private String name;
    private int age;
    public Person() {
    }

    @Override
    public int hashCode() {
        //return super.hashCode();
        return 111;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
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
}
