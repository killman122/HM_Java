package com.heima.extends_constructor;

public class Test1 {
    public static void main(String[] args) {
        new Zi();
    }
}
class Fu{
    public Fu(){
        System.out.println("Fu的无参构造方法");
    }
    public Fu(String name){
        this();//调用子类中的有参构造器
        System.out.println("Fu的有参构造方法");
    }
}
class Zi extends Fu{
    public Zi(){
        this("王道");//调用子类中的有参构造器
        System.out.println("Zi的无参构造方法");
    }
    public Zi(String name){
        super("1");//调用父类中的有参构造器
        System.out.println("Zi的有参构造方法");
    }
}