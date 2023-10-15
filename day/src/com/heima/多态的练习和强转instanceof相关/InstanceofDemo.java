package com.heima.多态的练习和强转instanceof相关;

import com.heima.abstract_demo.test.Cat;
import com.heima.abstract_demo.test.Dog;

/*
    instanceof关键字：
        A:用于判断对象的具体类型
        B:格式：
            对象 instanceof 类型
        C:案例演示
            a:基本类型判断
            b:引用类型判断
            c:特殊类型判断
                null
                向上转型
                向下转型
    关键字: instanceof
    格式: 对象名  instanceof 引用数据类型
    作用: 判断一个对象是否属于一种引用数据类型,返回boolean类型值
    注意: 两边必须有继承关系才能判断,没有继承关系编译失败
    通俗的理解: 判断关键字左边的变量,是否属于右边的数据类型,并返回boolean 数据类型的结果

 */
public class InstanceofDemo {
    public static void main(String[] args) {
//        Animal a = new Dog();
//        System.out.println(a instanceof Dog); //true
//        System.out.println(a instanceof Cat); //false
    }
}
