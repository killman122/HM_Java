package com.itheima.api_demo.integer_demo;
/*
    Integer类
        Integer 类在对象中包装了一个基类 int 的值。Integer 类的对象包含一个 int 类的字段

        自定义常量 :
            public static final int MAX_VALUE:值为 2^31-1的常量
            public static final int MIN_VALUE:值为-2^31的常量
        构造方法 :
            public Integer(int value) ;把int数封装成对应的包装类对象
            public Integer(String s)把String数据封装成对应的包装类对象
                注意 : s中的内容必须是数字字符
        自动装箱和自动拆箱 :JDK5版本开始
            自动装箱 :把基本数据类数据赋值给对应的包装类类型
            自动拆箱 :把包装类类型数据赋值给对应的基本数据类型
            自动装箱通过的是Integer类中静态方法 :public static Integer valueof(int i)
            自动拆箱通过的是Integer类中的成员方法 : public int intValue()
 */
public class IntegerDemo {
    public static void main(String[] args) {
        //public Integer(int value) ;把int数封装成对应的包装类对象
        Integer i = Integer.valueOf(1);
        Integer integer = 10;//实现自动装箱自动装箱实质上是使用了valueOf方法将int类型转为它的引用类型
        System.out.println(i);
        int num = integer;//自动拆箱

    }
}
