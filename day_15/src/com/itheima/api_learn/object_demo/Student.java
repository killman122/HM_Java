package com.itheima.api_learn.object_demo;

import java.util.Objects;

public class Student {
    private String name;
    private int age;

    @Override
    public String toString() { //在创建这个类后重写这个类的描述
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public Student() {
    }

    public Student(String name, int age) {
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

    @Override
    public boolean equals(Object o) {
        /**
         * this = s1
         * o = s2
         * this.getClass() 但是省略了this对象,获取的是s1对象的字节码文件   同一个类中的字节码文件相同
         */
        if (this == o) return true;//比较两个对象的地址是否相同,存在的意义是提高代码执行的效率,在发现两个对象的地址值相等后,不在比较其余的特征
        if (o == null || getClass() != o.getClass()) return false;//提高代码的健壮性
        //多态中的向下转型
        Student student = (Student) o;
        return age == student.age && Objects.equals(name, student.name);//这里的equals方法指的是String类中的equals方法比较字符串是否相等
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
