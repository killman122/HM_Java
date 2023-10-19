package com.itheima.genericity_demo.genericity_method;

import java.util.ArrayList;
import java.util.Arrays;

/*
    定义存储字符串ArrayList集合,将字符串的集合转化为字符串数组

    public interface Collection<E> extends Iterable<E> {
        <T> T[] toArray(T[] a);//将集合变为数组
        <T> T[] toArray(T[] a) 返回包含此集合中所有元素的数组; 返回的数组的运行时类型是指定数组的运行时类型
    }
 */
public class Demo {
    public static void main(String[] args) {
        show("abc");
        show(1);
        show('c');
        //定义存储字符串ArrayList集合,将字符串的集合转化为字符串数组
        ArrayList<String> list = new ArrayList<>();
        list.add("abc");
        list.add("wasd");
        list.add("jkl");
        String[] array = list.toArray(new String[list.size()]);//将集合转化为数组,需要传入一个数组,数组的长度至少为集合的长度,否则会报错,将集合的长度传入数组的长度中,集合的长度是多少数组的长度就是多少
        System.out.println(Arrays.toString(array));
    }

    public static <E> void show(E e) {//只有先定义了泛型对方法进行约束,才能在方法中使用泛型,注意在定义泛型的时候,泛型的约束必须要在返回值的前面,访问权限修饰符的后面,否则会报错
        System.out.println(e);
        if (e instanceof String) {
            System.out.println("字符串");
        } else if (e instanceof Integer) {
            System.out.println("整数");
        } else {
            System.out.println("其他类型");
        }

    }
}
