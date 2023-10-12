package com.heima.ArrayList集合入门;

import java.util.ArrayList;
import java.util.Iterator;

/*
    常用方法小结:
        boolean add(E e)    将指定的元素追加到此列表的末尾
 */
public class Demo4 {
    public static void main(String[] args) {
        ArrayList<Object> list = new ArrayList<>();
        //boolean add(E e)将指定的元素追加到列表的末尾
        list.add("王道");
        list.add(123);
        list.add("满分学习");
        list.add(0, "张三");
        list.add(3, "张三");
        list.add(4, "张三");
        list.add(5, "张三");
        for (Object o : list) {
            System.out.println(o);
        }
        System.out.println(list);//返回了类似于字符串的toString()方法处理过的[]包裹的
        list.add(0, "王三思");
        int size = list.size();
        for (int i = 0; i < list.size(); i++) {
            System.out.println(i);
        }
        //迭代器
        //Iterator<E>   iterator()    以正确的顺序返回该列表中的元素的迭代器
        System.out.println("迭代器的使用迭代集合中的元素开始=================>");
        Iterator<Object> iterator = list.iterator();//使用该方法相当于将list集合中的元素复制一份到迭代器中
        while (iterator.hasNext()) {//这里调用迭代器的hasNext()方法,返回一个boolean类型的返回值真/假,当返回为真,循环中的循环体才能够执行
            Object next = iterator.next();
            System.out.println(next);//在不指定泛型的具体限定类型时,使用系统默认的Object对象传入泛型的限定中,这是一种通过的做法,在不知道数据类型如何限定的情况下
        }
        //删除在集合中的元素张三,注意这里指的是所有的张三元素,这里可以调用Java中的remove方法/removeIf,但是后者函数会删除包含指定关键字的所有元素,但是前者试一试默认删除第一位寻找到的元素
//        for (int i = 0; i < list.size(); i++) {
//            Object o = list.get(i);
//            if (o == "张三") {
//                list.remove(o);
//            }
//        }
//        for (Object o : list) {
//            if (o.equals("张三")){
//                list.remove(o);
//            }
//        }
        /**
         在Java中，ConcurrentModificationException 是一个运行时异常，它通常在一个线程正在迭代一个集合对象（如 List, Set, Map等）时，而另一个线程同时修改了该集合对象，这时候就有可能抛出此异常。
         在单线程环境中，它也会发生。比如，当我们在遍历集合对象（使用迭代器或者增强for循环）时，如果在遍历过程中试图直接通过集合对象的 add(), remove()等方法修改集合内容（添加或删除元素），那么同样会抛出 ConcurrentModificationException。
         解决这类问题的一种方式是，通过使用迭代器的 remove() 方法，而非集合对象的 remove() 来移除元素。初次见到这个异常可能会觉得困惑，但理解了其背后的原理，找到出错的位置并改正就不难了。
          */
        for (int i = 0; i < list.size(); i++) {
            Object o = list.get(i);
            if (o == "张三") {
                list.remove(o);
                i--;//当删除元素时i减少,避免了由于长度变化的原因导致的元素被跳过,相当于索引下标没有增加继续在当前下标探索,知道当前下标元素不能删除
            }
        }
        //使用迭代器的方法
        Iterator<Object> iter = list.iterator();
        while (iter.hasNext()) {
            Object o = iter.next();
            if (o.equals("张三")) {
                iter.remove();
            }
        }
        System.out.println("使用迭代器循环遍历删除集合中所有符合条件的元素");//TODO 这里的循环迭代似乎不能直接使用for遍历元素类似for..in方法,由于直接使用for/fori的方法都会将集合的长度改变,由于集合的底层是数组元素,所以在使用时会改变集合的长度,导致元素未被扫描到,或者是出现ConcurrentModificationException异常
        System.out.println(list);
        System.out.println("==================使用removeIf方法后================");
        list.removeIf(o -> o == "张三");
        System.out.println(list);

        //修改集合中的元素
        //E set(int index, E element) 用指定的元素替换此列表中指定位置的元素   貌似E 类型的数据都是元素,一般是指的对象序列中元素
        list.set(0,"wangdao");
        System.out.println(list);
    }
}
