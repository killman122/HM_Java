package com.itheima.collections_demo;

public class Student implements Comparable {//实现了自然排序的接口,但是在需要名称的排序时,需要对字符串进行排序默认情况下是没有的,所以这里选择自定义比较器,可以通过继承Comparator或者直接构造匿名内部类
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

    public void setAge(int age) {
        this.age = age;
    }

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
