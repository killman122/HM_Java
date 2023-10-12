package com.heima.anonymous;
/*
    匿名对象:没有名字的对象,叫做匿名对象
    一般如果一个对象使用一次,那么我们可以使用匿名对象

    使用方式:
        1 直接调用方法
        2 作为方法的参数传递
        3 作为方法的返回值返回
    注意:
        匿名对象只能使用一次,下次再用不得不再创建一个新对象
        方法的参数是一个类,那么调用此方法需要传入此类的对象
        方法的返回值是一个类,那么此方法需要返回此类的对象
        new 类名();
        new 类名(参数);
 */
public class Test {
    public static void main(String[] args) {
        //直接调用方法
        new Student().show();
        method(new Student());
        getStudent();
    }
    //作为方法的参数传递
    public static void method(Student s){//方法的参数是一个类对象,那么调用此方法需要传入此类的对象
        s.show();
    }
    //作为方法的返回值返回
    public static Student getStudent(){
        return new Student();
    }
}

//定义学生类
class Student{
    public void show(){
        System.out.println("我爱学习");
    }
}