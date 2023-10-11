package com.heima.类;

public class TestStudnet {
    public static void main(String[] args) {
        Student student = new Student();
        student.setAge(20);
//        student.name = "王道";
        student.setName("王道");
        System.out.println(student.getAge());
        student.eat();
        student.study();
        student.sleep();
    }
}
