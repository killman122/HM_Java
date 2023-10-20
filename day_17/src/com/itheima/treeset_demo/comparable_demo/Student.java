package com.itheima.treeset_demo.comparable_demo;

public class Student implements Comparable<Student> {
    private String name;
    private int age;

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

    //重写接口中的抽象方法
    @Override
    public int compareTo(Student o) {
        //需求是根据年龄的升序排序
        int result = this.getAge() - o.getAge();
        //如果年龄一样,则按照姓名首字母升序排序
//        int i == 0 ? this.getName().charAt(0) - o.getName().charAt(0) : i;
        //获取姓名的第一个字符,并转换为int类型
        //如果年龄一样,按照名字进行升序排序
        //默认情况下,通过字符串中compareTo方法进行比较,返回的是字符串中第一个字符的Unicode码值的差值

        return result == 0 ? this.getName().compareTo(o.getName()) : result;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
