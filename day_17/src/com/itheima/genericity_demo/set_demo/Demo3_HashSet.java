package com.itheima.genericity_demo.set_demo;

public class Demo3_HashSet {
    public static void main(String[] args) {
        Person person = new Person();
        System.out.println(person.hashCode());
        System.out.println(person.hashCode());

        //默认情况下,不同对象的哈希值是不同的.而重写hashCode()方法,不同的对象的哈希值有可能相同
        Person person1 = new Person();
        Person person2 = new Person();
        System.out.println(person1.hashCode());
        System.out.println(person2.hashCode());
        System.out.println("通话".hashCode());//由于String类中默认重写了hashCode()方法,所以字符串对象的哈希值是不同的,但是在自己创建的Person类中重写了hashCode()方法,所以不同的对象的哈希值有可能相同(当设置return时返回的hash值可以定死)
        System.out.println("写码".hashCode());//在创建的对象中hashCode的值根据地址进行计算,但是在String类中重写了hashCode()方法,则会更具内容来计算得到hash值而不是通过地址计算来得到hash值
    }
}
