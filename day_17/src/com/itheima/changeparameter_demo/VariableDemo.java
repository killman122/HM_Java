package com.itheima.changeparameter_demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
    Collections的addAll方法
    static<T> boolean addALl( Collections<T> c ， T...elements ):   添加任多个数到集合中
    分析: 该方法就是一个含有可变参数的方法，使用时可以传入任意多个实参，实用方便!
    练习:创建-个List集合，使川addALL方法传入若干字符串
 */
public class VariableDemo {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
//    static<T> boolean addALl( Collections<T> c ， T...elements ):   添加任多个数到集合中
        System.out.println(Collections.addAll(list, "a", "b", "c", "d"));//第一个参数要求一个Collections单例集合
        System.out.println(list);
    }

    public static <T>void addElement(List<T> list,T...t){//先写参数中的泛型限定,但是会报错,所以需要先补全返回值前的泛型限定
        for (T element : t) {
            list.add(element);
        }
    }
}
