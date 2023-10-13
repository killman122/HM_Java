package com.heima.static_demo;

/*
    static 关键字的特点:
        1:生命周期随着类的加载而加载
        2:优先于对象存在
        3:静态成员被本类的所有对象共享
        4:可以通过类名调用,也可以通过对象调用,推荐对静态成员使用类名调用的方式调用

    static 关键字注意事项:
        非静态方法可以访问任何成员(包括静态和非静态)
        静态方法中只能访问静态成员,要想访问非静态成员需要使用对象调用
        静态方法中不能使用this关键字
 */
public class Student {
    public int age;
    public static String school;
    public String name;
    public void show(){
        System.out.println("名字"+name);
        System.out.println("年龄"+age);
        System.out.println("学校"+school);
    }
    //非静态方法
    public void method(){
        System.out.println(name);
        System.out.println(school);
        method1();
        metho2();
    }
    public void metho2(){
        System.out.println(name);
        System.out.println(school);
    }

    //静态方法
    public static void method1(){
//        System.out.println(name);
        System.out.println(school);
        method3();
//        metho2();
    }
    public static void method3(){
        Student student = new Student();
        System.out.println(student.name);
//        System.out.println(name);
        System.out.println(school);
        method1();
        student.metho2();
    }
}
