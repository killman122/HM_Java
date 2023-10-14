package com.heima.interface_defaultmethod;
/*
    1 JDK8 版本可以在接口中定义默认方法
    2 默认方法使用default关键字修饰:
        default void method(){
            //方法体
        }
        允许在接口中定义非抽象方法,但是需要使用关键字default修饰
    3 接口中的默认方法,可以通过实现类对象直接调用
    4 接口中的默认方法,可以被实现类重写
    作用: 解决接口升级的问题
    格式: public default 返回值类型 方法名(参数列表){...}
         public default void method(){
            System.out.println("默认方法");
        }
    注意事项:
        1 默认方法不是抽象方法,所以不强制被重写,但是可以被重写,重写时需要去除default关键字
        2 public 可以省略,default不能省略
        3 如果实现了多个接口,多个接口存在相同的方法声明,那么实现类(子类)必须对这个方法进行重写,否则无法判断到底是要实现哪个接口中的同名方法
 */
public class Demo {
    public static void main(String[] args) {

        new InnerAImpl().method();
        new InnerAImpl().method1();
        new InnerAImpl1().method1();
    }
}

//写一个接口
interface InnerA{
    public abstract void method();//对于接口的应用而言,如果没有abstract关键字,也是抽象方法,在添加抽象方法后,实现类必须重写,但是会导致实现类的重写过于复杂并且冗余
    public default void method1(){//通过实践发现,在接口中实现了默认方法后,如果实现类不重写,那么实现类可以直接调用接口中的默认方法,如果实现类重写了接口中的默认方法,那么实现类就不能直接调用接口中的默认方法
        System.out.println("InnerA接口中的默认方法");
    }
}

interface InnerB{
    public abstract void method();//对于接口的应用而言,如果没有abstract关键字,也是抽象方法,在添加抽象方法后,实现类必须重写,但是会导致实现类的重写过于复杂并且冗余
    public default void method1(){//通过实践发现,在接口中实现了默认方法后,如果实现类不重写,那么实现类可以直接调用接口中的默认方法,如果实现类重写了接口中的默认方法,那么实现类就不能直接调用接口中的默认方法
        System.out.println("InnerA接口中的默认方法");
    }
}

class InnerAImpl implements InnerA,InnerB{

    @Override
    public void method() {
        System.out.println("重写了接口中的抽象方法");
    }

    @Override
    public void method1() {
        System.out.println("接口中的默认方法被Impl重写了");
    }
}

class InnerAImpl1 implements InnerA,InnerB{

    @Override
    public void method() {

    }

    @Override
    public void method1() {
        InnerB.super.method1();
        System.out.println("实现类必须重写两个接口中的默认方法");
        //必须重写,否则无法判断到底是要实现哪个接口中的同名方法
        //但是也可以选择性的调用任意一个接口中的默认方法
    }
}