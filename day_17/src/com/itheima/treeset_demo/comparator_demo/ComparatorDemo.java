package com.itheima.treeset_demo.comparator_demo;

import java.util.Comparator;
import java.util.TreeSet;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

public class ComparatorDemo {
    public static void main(String[] args) {
        //创建集合对象
        TreeSet<Teacher> treeSet = new TreeSet<>(new ComparatorImpl());//接收Comparator接口的实现类对象
        //使用匿名内部类的方式改进,创建集合对象并接收Comparator接口的实现类对象
        TreeSet<Teacher> treeSet1 = new TreeSet<>(new Comparator<Teacher>() {
            @Override
            public int compare(Teacher o1, Teacher o2) {
                int result = o1.getAge() - o2.getAge();
//                return 0;
                return result ==0 ? o1.getName().compareTo(o2.getName()) : result;
            }
        });
        //创建对象添加到集合中,这里使用匿名对象的方式
        treeSet.add(new Teacher("zhangsan", 23));
        treeSet.add(new Teacher("lisi", 25));
        treeSet.add(new Teacher("wangwu", 24));
        treeSet.add(new Teacher("zhaoliu", 23));
        //打印集合对象
        System.out.println(treeSet);
    }
}

class ComparatorImpl implements Comparator<Teacher> {

    @Override
    public int compare(Teacher o1, Teacher o2) {
        //根据年龄的升序排序
        int result = o1.getAge() - o2.getAge();
        //年龄相同根据名字排序,String类型的compareTo方法根据字符串的Unicode码值排序,年龄相等的根据名字的升序排序,年龄不等的根据年龄的升序排序
        return result == 0 ? o1.getName().compareTo(o2.getName()) : result;
    }

    @Override
    public Comparator<Teacher> reversed() {
        return Comparator.super.reversed();
    }

    @Override
    public Comparator<Teacher> thenComparing(Comparator<? super Teacher> other) {
        return Comparator.super.thenComparing(other);
    }

    @Override
    public <U> Comparator<Teacher> thenComparing(Function<? super Teacher, ? extends U> keyExtractor, Comparator<? super U> keyComparator) {
        return Comparator.super.thenComparing(keyExtractor, keyComparator);
    }

    @Override
    public <U extends Comparable<? super U>> Comparator<Teacher> thenComparing(Function<? super Teacher, ? extends U> keyExtractor) {
        return Comparator.super.thenComparing(keyExtractor);
    }

    @Override
    public Comparator<Teacher> thenComparingInt(ToIntFunction<? super Teacher> keyExtractor) {
        return Comparator.super.thenComparingInt(keyExtractor);
    }

    @Override
    public Comparator<Teacher> thenComparingLong(ToLongFunction<? super Teacher> keyExtractor) {
        return Comparator.super.thenComparingLong(keyExtractor);
    }

    @Override
    public Comparator<Teacher> thenComparingDouble(ToDoubleFunction<? super Teacher> keyExtractor) {
        return Comparator.super.thenComparingDouble(keyExtractor);
    }
}