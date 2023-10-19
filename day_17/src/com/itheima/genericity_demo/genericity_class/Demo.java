package com.itheima.genericity_demo.genericity_class;

public class Demo {
    public static void main(String[] args){
        Person<String> person = new Person<String>("篮球");
        Person<String> person1 = new Person<>();
        Person<Swimming> person2 = new Person<>();
        Person<BaseketBall> person3 = new Person<>();
//        person2.setHobby();
//        person1.setHobby();
    }
}

//定义一些可能会用到的泛型类
class Swimming{}
class PingPang{}
class BaseketBall{}
class Person<H>{
    public H getHobby() {
        return hobby;
    }

    public void setHobby(H hobby) {
        this.hobby = hobby;
    }

    public Person(H hobby) {
        this.hobby = hobby;
    }

    public Person() {
    }

    //属性-->爱好
    private H hobby;//当一个类中的属性的类型无法确定就可以使用泛型类

    @Override
    public String toString() {
        return "Person{" +
                "hobby=" + hobby +
                '}';
    }
}