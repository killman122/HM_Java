package com.heima.匿名内部类;

/*
    以匿名对象的方式调用
        1. 使用父类型变量多态接收匿名子类型对象
        2. 使用匿名对象的方式使用
            1 直接调用方法使用
            2 当做方法的参数传递
            3 当做方法的返回值使用
 */
public class Test1 {
    public static void main(String[] args) {
        //使用父类型变量多态接收匿名子类型对象
        Flyable flyable = new Flyable() {//多态的使用方式,接口的引用指向子类对象/实现类对象,尽管这里的实现的方式是通过匿名内部类的方式实现抽象接口而不是通过直接使用实现类的方式实现接口,这里需要注意,在接口中对于抽象方法的重写
            @Override
            public void fly() {
                System.out.println("飞");
            }
        };
        flyable.fly();//通过多态的方式调用子类/实现类中重写的方法  编译看左边数据类型接口存在,运行看右边数据类型子类存在

        //使用匿名对象的方式使用       直接调用方法使用
        new Flyable() {//匿名内部类的直接创建方式,创建了一个Flyable接口的子类对象,并且重写了Flyable接口中的fly方法
            @Override
            public void fly() {
                System.out.println("飞");
            }
        }.fly();//直接调用了fly方法

        //2 当做方法的参数传递       这里的方法需要是一个接口类型的参数并且这里的方法是一个静态方法,所以需要传入一个接口的实现类对象,可以使用子类实现匿名内部类的方式或者直接使用匿名内部类的方式
        useFlyable(new Flyable() {//匿名内部类的直接创建方式,创建了一个Flyable接口的子类对象,并且重写了Flyable接口中的fly方法
            @Override
            public void fly() {
                System.out.println("飞");
            }
        });

        //3 当做方法的返回值使用


    }
    private static Flyable getFlyable() {

        return new Flyable() {//匿名内部类的直接创建方式,创建了一个Flyable接口的子类对象,并且重写了Flyable接口中的fly方法
            @Override
            public void fly() {
                System.out.println("飞");
            }
        };
    }


    private static void useFlyable(Flyable flyable){
        flyable.fly();
    }
}



interface Flyable {
    void fly();
}