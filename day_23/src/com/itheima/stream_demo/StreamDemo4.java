package com.itheima.stream_demo;

import java.util.ArrayList;
import java.util.Collections;

/*
    Stream流中常见的终结操作方法
    - void forEach(Consumer action)：对此流的每个元素执行操作
    - Consumer接口中的方法 void accept(T t)：对给定的参数执行此操作
    - long count()：返回此流中的元素数
 */
public class StreamDemo4 {
    public static void main(String[] args) {
        //新建一个数组
        ArrayList<Object> list = new ArrayList<>();
        Collections.addAll(list,"张无忌","张翠山","张三丰","谢广坤","赵四","刘能","小沈阳","张良");
        /*
            forEach()方法会拿到流中的每一个数据,把每一个数据传入给lambda表达式中的形参
            void forEach(Consumer<? super T> action);//抽象函数也是接口函数接口必须要实现重写的方法
            Consumer类型接口是一个函数式接口,所以必须要实现该抽象方法的重写,public interface Consumer<T> void accept(T t);
            由于是一个函数式接口,所以可以使用lambda表达式的方式传入参数,但是注意参数的泛型限定必须和调用该方法的对象一致,上面list中的泛型是Object,所以在lambda表达式的参数中的泛型也是Object
         */
        list.stream().forEach((Object s)->{
            System.out.println(s);
        });
        list.stream().forEach(System.out::println);
        System.out.println(list.stream().count());


    }
}
