package com.heima.成员内部类;
/*
    创建成员内部类的对象 : 外部类名.内部类名 对象名 = new 外部类名().new 内部类名()
                      : 外部类名.内部类名 对象名 = new 外部类构造方法(...).new 内部类的构造方法(...);
 */
public class Test {
    public static void main(String[] args) {
//        Person.Heart heart1 = new Person.Heart();
        Person.Heart heart = new Person().new Heart();
        heart.beats();
        heart.show();//通过测试可以发现这里heart是成员内部类的对象,只能调用内部类中实现的方法
    }
}

//外部类
class Person{
    private int age = 10;

    public void  show(){
        //创建的是外部类的show()方法,所以这里不算是重载,但是内部类中私有的属性和方法都可以在外部类中调用
        Heart heart = new Heart();
        System.out.println(heart.age);
    }
    class Heart{
        private int age = 20;
        private int rate;
        public void beats(){
            System.out.println("心脏在跳动");
        }

        public void show(){
            int age = 30;
            System.out.println(age); //30
            System.out.println(this.age); //20 this表示本类的对象,本类对象调用的属性就是内部类的成员变量
            System.out.println(Person.this.age); //10   这里的this表示外部类对象,外部类对象调用的属性就是外部类的成员变量
        }
    }
}
