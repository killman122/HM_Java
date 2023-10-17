package com.itheima.api_learn.object_demo;
<<<<<<< HEAD

=======
>>>>>>> origin/master
/*
    ==: 关系运算符
    比较基本数据类型: 比较的是数据值
    比较引用数据类型: 比较的是地址值

    结论:
        如果一个类没有重写equals方法,那么比较这个类的对象的地址是否相等
        如果一个类重写了equals方法,那么比较这个类对象的属性值是否相等
 */
public class Test {
    public static void main(String[] args) {
        Student student = new Student("王道",21);
        Student student1 = new Student("王道",21);
        //需求判断两个对象的内容是否相等
//        System.out.println(student1==student);//false
        System.out.println(student.equals(student1));//false
        //使用alt+insert 可以在创建的类中生成重写的equals()方法和hashcode()方法
        //在重写equals后能够确认两个对象之间是否相等
    }
}
