package com.heima.匿名内部类;
/*
    匿名内部类格式 :
        new 父类/接口(){
            重写父类/接口中的方法
        };

        new 抽象类名/接口名{
            需要重写抽象类/接口中的抽象方法
        };

    注意: 创建的是父类/接口的子类对象,所以可以使用父类/接口的引用接收
 */
public class Test {
    public static void main(String[] args) {
        //创建一个SwimmingImpl对象,并传递给引用接口Swimming
        Swimming s = new SwimmingImpl();
        useSwimming(s);
        //匿名内部类
        useSwimming(() -> System.out.println("游泳"));//对于匿名内部类的使用,可以直接使用lambda表达式进行格式上的优化,出现灰色的部分代码就是可以进行优化的代码,直接使用alt+enter+enter的方式将格式转变为lambda表达式

        //创建了一个实现类独享,并且重写了Swimming接口中的swimming方法,是一个接口的实现类对象而不是接口本身对象
        new Swimming(){//匿名内部类的直接创建方式,创建了一个Swimming接口的子类对象,并且重写了Swimming接口中的swimming方法
            @Override
            public void swimming() {
                System.out.println("游泳");
            }
        };
    }
    public static void useSwimming(Swimming s){//传入一个接口对象,调用接口的swimming方法,但是由于接口是抽象类的集合不能使用new关键字创建对象,所以需要传入一个实现类对象
        s.swimming();
    }
}
interface Swimming{
    void swimming();//定义一个抽象方法在接口中默认添加了public 和 abstract关键字

}

class SwimmingImpl implements Swimming{

    @Override
    public void swimming() {
        System.out.println("游泳");
    }
}