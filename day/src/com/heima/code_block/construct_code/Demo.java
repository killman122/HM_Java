package com.heima.code_block.construct_code;
/*
    构造代码块:
        1 定义格式: 在类中方法外定义一对大括号
        2 作用: 构造代码块中定义的是不同对象共性的初始化内容
        3 执行: 每次调用构造方法执行前,都会先执行构造代码块
 */
public class Demo {
    public static void main(String[] args) {
        Student student = new Student();//这里调用空参的构造函数,所以会先执行构造代码块,再执行构造函数
        new Student()
    }
}

class Student{
    //构造代码块
    {
        System.out.println("构造代码块");
    }
    public Student() {
        System.out.println("空参构造");
    }
    public Student(int num)
    {
        System.out.println("有参构造");
    }
}
