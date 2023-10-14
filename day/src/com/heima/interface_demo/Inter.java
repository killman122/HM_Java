package com.heima.interface_demo;

//定义第一个接口使用了访问修饰符和abstract关键字
public interface Inter {
    public abstract void show();//由于接口就是抽象方法的集合,所以在定义方法时可以省略public abstract关键字

    public abstract void method();//由于接口就是抽象方法的集合,所以在定义方法时可以省略public abstract关键字
}

//定义第二个接口,不使用访问修饰符,对于内部的抽象方法也可以省略public abstract关键字
interface Inter2 {
    void show();
    public abstract void method0();
    void method();
}

//同一个子类可以实现多个接口,使用逗号分隔,但是只能继承于一个父类,但是当继承和实现implements同时出现时,继承必须在实现implements之前,extends..implement ..xxx
abstract class InterImpl2 extends Object implements Inter, Inter2 {//抽象类可以不重写接口中的抽象方法,但是如果不重写,那么该抽象类也必须是抽象类
    //如果不是抽象类,那么编译器会报错
}

//实现类,一般对象实现接口的类的取名,<接口名xxxImpl>
class InterImpl implements Inter {//和抽象方法的实现相同,子类需要将父类的所有抽象方法全部重写,或者使用abstract关键字修饰子类为抽象类

    @Override
    public void show() {
        System.out.println("show");
    }

    @Override
    public void method() {
        System.out.println("method");
    }
}