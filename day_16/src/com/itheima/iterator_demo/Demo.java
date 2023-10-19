package com.itheima.iterator_demo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Demo {
    public static void main(String[] args) {
        //创建集合对象并使用接口Collection引用
        Collection<String> c = new ArrayList<>();//注意对于接口是没法new处对象的因为抽象类和接口都是不能被实例化的
        //添加元素
        System.out.println(c.add("智取威虎山"));
        System.out.println(c.add("赵云"));
        System.out.println(c.add("大乔"));
        //遍历集合
        Iterator<String> it = c.iterator();//返回一个迭代器对象,并且使用String泛型来限定
        //System.out.println(it.next());//使用迭代器对象的next方法来获取集合中的第一个元素
        //System.out.println(it.next());//使用迭代器对象的next方法来获取集合中的第2个元素
        //System.out.println(it.next());//使用迭代器对象的next方法来获取集合中的第3个元素
        //优化版本使用循环迭代判断
        while (it.hasNext()) {//使用迭代器对象的hasNext方法来判断集合中是否还有元素
            System.out.println(it.next());//使用迭代器对象的next方法来获取集合中的元素
        }
        System.out.println(c.add("孙中山"));
        while (it.hasNext()){//在这里需要重新获取迭代器对象由于将迭代器中的数据增加了,否则也会爆出并发异常
            String next = it.next();
            if (next.equals("孙中山")){
                //c.remove("孙中山");//使用集合对象的remove方法来删除集合中的元素,会产生并发异常
                it.remove();//使用迭代器对象的remove方法来删除集合中的元素,但注意使用迭代器的remove方法默认是删除的最后一个元素
            }
        }
        // System.out.println(it.next());//当可迭代对象中的所有的方法都使用完成后,再次调用next方法就会报错,因为没有元素了NoSuchElementException
    }
}
