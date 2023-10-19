package com.itheima.genericity_demo.wildcard;

import java.util.ArrayList;

public class Test1 {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Object> list2 = new ArrayList<>();
        ArrayList<String> list3 = new ArrayList<>();
        ArrayList<Number> list4 = new ArrayList<>();
        //show1(list1);
        show1(list2);//这里的list2是一个Object类型的集合,而Object是Number的父类,所以可以传入
        //show1(list3);
        show1(list4);//这里的list4是一个Number类型的集合,所以可以传入
        show2(list1);//这里的list1是一个Integer类型的集合,而Integer是Number的子类,所以可以传入
        //show2(list2);
        //show2(list3);
        show2(list4);//这里的list4是一个Number类型的集合,所以可以传入
    }

    //泛型的下限
    //show1方法,参数只接收元素类型是Number或者其他父类型的集合
    //接收的集合,集合中元素的类型可以是Number或者Number的父类型
    public static void show1(ArrayList<? super Number> list){

    }
    //泛型的上限
    //show2方法,参数只接收元素类型是Number或者其他子类型的集合
    //接收的集合,集合中元素的类型可以是Number或者Number的子类型
    public static void show2(ArrayList<? extends Number> list){

    }
}
