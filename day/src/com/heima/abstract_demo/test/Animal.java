package com.heima.abstract_demo.test;
/*
    需求 : 定义猫类(Cat)和狗类(Dog)
        猫类成员方法: eat (猫吃鱼) drink (喝水)
        狗类成员方法: eat (狗吃肉) drink (喝水)
    要求: 使用继承的思想,描述猫类和狗类
    分析:
        猫类和狗类的共性内容: 喝水
        猫类和狗类的特有内容: 吃的东西不同
        猫类和狗类中存在共性内容,应该向上抽取一个动物类(Animal)
        父类Animal中,无法将 eat()方法具体实现描述清除,所以改为抽象类型定义
        抽象方法需要存活在抽象类中,将Animal类定义为一个抽象类
        让Cat 和 Dog类分别继承于Animal类,并重写eat()方法
        测试类中创建Cat 和 Dog 对象,调用方法测试
 */
public abstract class Animal {
    abstract void eat();
    public void drink(){
        System.out.println("喝水");
    }
}
