package com.heima.abstract_template;
//该类作为模板的继承子类
public class Tom extends Template {

    @Override
    public void body() {
        System.out.println("Tom写代码");
    }
}
class Rose extends Template{
    @Override
    public void body() {
        System.out.println("Rose写代码");
    }
}

class Test {
    public static void main(String[] args) {
        Tom tom = new Tom();
        tom.write();
        Template rose = new Rose(); //在使用模板方法时,以及使用抽象类和抽象函数时,在创建对象时可以直接使用父类名来引用,这里的rose就是一个抽象类的引用,展示了面向对象中的多态性;
        /**
         *
         在Java语言中，那种将父类的引用指向子类对象的现象，我们通常称之为“多态”（Polymorphism）。
         多态是指可以使用父类型的引用指向子类型的对象，或者使用接口类型的引用指向实现了接口的对象。这是面向对象编程的一个重要特性。
         例如，假设我们有一个Animal父类和一个继承自Animal的Dog子类，那么我们可以如下使用：
         Animal myDog = new Dog();
         */
        rose.write();
    }
}