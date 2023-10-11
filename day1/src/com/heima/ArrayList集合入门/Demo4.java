package com.heima.ArrayList集合入门;

import java.util.ArrayList;

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
        for (Object o : list) {
            System.out.println(o);
        }
        System.out.println(list);//返回了类似于字符串的toString()方法处理过的[]包裹的
        list.add(0,"王三思");
        int size = list.size();
        for (int i = 0; i < list.size(); i++) {
            System.out.println(i);
        }
        //迭代器
        //Iterator<E>   iterator()    以正确的顺序返回该列表中的元素的迭代器

    }
}
