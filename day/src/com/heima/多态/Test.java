package com.heima.多态;

public class Test {
    public static void main(String[] args) {
//        //创建猫对象,但是被动物父类a引用
//        Aniaml a = new Cat1();
//        a.eat();
////        a.catchMouse(); //错误: 找不到符号
//        //创建狗对象
//        a = new Dog1();
//        a.eat();
//        //a.lookHome(); //错误: 找不到符号
//        //创建猪对象
//        a = new Pig();
//        a.eat();
//        //a.gongDi(); //错误: 找不到符号
        test(new Dog1());
        test(new Cat1());
        test(new Pig());
    }

    //一个 Animal 类型的引用 a 指向（或引用）一个 Cat1 对象
    public static void test(Aniaml a) {//传入一个动物对象,调用动物的吃的方法
        //依旧是引用的方法,但是将父类引用指向子类对象,这样就可以调用子类的方法了
        //但是没有显式的直接将new 出的子类对象传递给动物类,所以这里的多态是一种隐式的多态,而是通过函数传参的方式隐式传入
        a.eat();
        if (a instanceof Dog1) {//instanceof 操作符用来判断一个对象是否是一个类或者是接口的实例,操作符的前面的操作数是要操作的对象,后面的操作数是要对比的类的类名
            Dog1 d = (Dog1) a;
            d.lookHome();
        } else if (a instanceof Cat1) {
            Cat1 c = (Cat1) a;
            c.catchMouse();
        } else if (a instanceof Pig) {
            Pig p = (Pig) a;
            p.gongDi();
//        }
        }
//    //测试狗类
//    public static void test(Dog1 d) {
//        d.eat();
//        d.lookHome();
//    }
//
//    public static void test(Cat1 c){//同一个类中的多个方法之间实现了重载,不同类之间才叫做重写
//        c.eat();
//        c.catchMouse();
//    }
//
//    public static void test(Pig p){
//        p.eat();
//        p.gongDi();
//    }
    }
}
