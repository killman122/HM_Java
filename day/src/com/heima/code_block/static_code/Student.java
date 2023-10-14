package com.heima.code_block.static_code;

class Student {
    final int NUM;

    //构造代码块,每次调用构造方法执行前,都会先执行构造代码块,可以在构造代码块中放置一些不同对象共性的初始化内容,final关键字初始化但是未赋值的也可以在构造代码块中初始化,不用在构造器中重复编写,如果有多个构造器
    {
        NUM = 10;
        System.out.println("构造代码块");
    }

    public Student() {
//        NUM = 10;
        System.out.println("空参构造");
    }

    public Student(int num) {
//        NUM = 10;
        System.out.println("有参构造");
    }
}
