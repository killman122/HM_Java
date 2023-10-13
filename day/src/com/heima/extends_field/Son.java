package com.heima.extends_field;

/*
    继承中成员变量访问特点:    就近原则
    this:   当前类的对象引用
    super:  父类数据存储的空间(看做成父类的对象)
    Java中的权限修饰符:public - protected - 默认的 - private
 */
//子类
public class Son extends Father {
    int age = 20;
    //通过下面的方法能够访问父类中的属性
    public void show(){
        System.out.println(num);//由于子类中没有该成员变量/属性 所以会去父类中找
        System.out.println("不带this的局部变量的"+age);//由于子类中有该成员变量/属性 所以会直接使用子类中的
        //再局部变量存在的情况下,优先访问局部变量离得近的成员变量,但是如果使用super关键字,则会访问父类中的成员变量,使用this相当于调用的依然是子类中的对象的属性也就是使用this调用成员变量,默认情况下是局部变量
        System.out.println("使用this后的"+this.age);
        //再使用super的超类关键字下,能够调用父类中的方法和属性,但是不能够调用父类中的私有属性和方法
        //如果再子类中重写了父类中的属性和方法那么如果需要使用父类中的属性和方法,但是由于就近原则,子类中默认查找子类中原有的属性和方法,如果需要使用父类中的属性和方法,则需要使用super关键字
        System.out.println("使用的super后的"+super.age);
    }
}

//父类
class Father {
    int age = 40;
    int num = 3;
}

//测试类
class Test{
    public static void main(String[] args) {
        Son son = new Son();
        son.show();
    }
}
