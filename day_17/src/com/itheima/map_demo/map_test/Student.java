package com.itheima.map_demo.map_test;

import java.util.Objects;

public class Student implements Comparable<Student> {//实现的接口中如果不指定泛型的限定,默认是Object顶层类,由于是对学生类进行排序,所以需要指定接口后的泛型类型为Student
    private String name;
    private int age;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
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

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Student() {
    }


    @Override
    public int compareTo(Student o) {
        //需求是根据年龄的升序排序
        int i = this.age - o.getAge();//也可以直接调用compareTo()方法进行操作
//        this.age.compareTo(o.getAge());
        //如果年龄相同在根据名字进行排序,获取姓名的第一个字符,并转换为int类型
        return i == 0 ? this.name.compareTo(o.getName()) : i;//当为0时,表示年龄差值为0,不存;如果年龄差值相等则按照名字进行排序,否则按照年龄进行排序
    }
}
