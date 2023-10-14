package com.heima.code_block.static_code;
/*
    静态代码块:随着类的加载而加载,只会执行一次,用于给类进行初始化,一般用于加载驱动
        1 定义格式: 在构造代码块前加上static关键字
        2 执行时机: 静态代码块在类加载时执行,并且只执行一次
        3 作用: 可以给静态成员变量赋值,也可以给静态成员变量进行初始化,但是如果不是静态的成员则不能使用静态代码块
        static{
            //静态代码块
            list.add(new Student(学校,学校,下));
        }
 */
public class Demo {
    public static void main(String[] args) {
        Student1 student1 = new Student1();
        Student1 student2 = new Student1(2);
    }
}
class Student1 {

    //静态代码块,随着类的加载而加载,只会执行一次,用于给类进行初始化,一般用于加载驱动
    static {
        System.out.println("静态代码块");
    }

    public Student1() {
//        NUM = 10;
        System.out.println("空参构造");
    }

    public Student1(int num) {
//        NUM = 10;
        System.out.println("有参构造");
    }
}
