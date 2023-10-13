package com.heima.extends_demo;
/*
     狗类: 颜色, 品种, 年龄, 吃(),喝(),看家()
     猫类: 颜色, 品种, 年龄, 吃(),喝(),抓老鼠()

     把多个类中的共性内容抽取到一个父类中: Animal(动物类)
     Animal: 颜色, 品种, 年龄, 吃(),喝()
 */
public class Test {
    public static void main(String[] args) {
        //空参+set
        Cat cat = new Cat(); //默认空参构造,此前的所有属性都是系统给出的默认值,所以需要设置一些属性使用set方法
        //默认除基本数据类型外的引用数据类型的取值都为null空,基本数据类型 数值 int byte short long 字符型 char 布尔型 boolean 浮点型 float double
        System.out.println(cat.getColor() + "," + cat.getBrand() + "," + cat.getAge());
        cat.setColor("白色");
        cat.setBrand("波斯猫");
        cat.setAge(1);
        System.out.println(cat.getColor() + "," + cat.getBrand() + "," + cat.getAge());

        //通过全参构造的方式生成对象,默认带有构造器中指定的属性,注意构造函数不能通过继承的方式获得
        new Cat("黑色", "英短", 2);
    }
}
