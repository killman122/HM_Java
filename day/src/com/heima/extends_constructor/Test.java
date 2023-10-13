package com.heima.extends_constructor;

public class Test {
    public static void main(String[] args) {
        Son son = new Son();
        System.out.println(son.name);
        System.out.println("------------");
        Son son1 = new Son("张三");
    }
}

class Father extends Object{
    //无参构造器,默认情况下JDK给出,和子类默认调用父类的无参构造器一样,默认
    String name = "张三";
    public Father() {
        //super();访问父类中的空参构造方法
        System.out.println("Father的无参构造方法");
    }

    public Father(String name) {
        System.out.println("Father的有参构造方法");
    }
}
class Son extends Father{
    public Son() {
//        this();
//        super();
//        'this()' 调用必须是构造函数主体中的第一条语句
//        this("1");//调用本类中的有参构造方法,this只能放置在无参构造器的第一行初始位置,默认情况下手动给出this时,但是super也只能放置在第一行初始位置,所以super和this不能同时出现
//        super();访问父类中的空参构造方法
        //super("张三");访问父类中的有参构造方法
        System.out.println("Son的无参构造方法");
    }
    public Son(String name) {
        this();//可以通过this关键字指定构造器去创建对象,当然也可以指定多个构造器,但是不能两个构造器之间相互调用形成闭环
//        super();//访问父类中的空参构造方法
        //super("张三");访问父类中的有参构造方法
        System.out.println("Son的有参构造方法");
    }
}