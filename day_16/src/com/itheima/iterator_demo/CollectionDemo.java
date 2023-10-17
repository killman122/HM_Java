package com.itheima.iterator_demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

/*
    public boolean add(E e)：  把给定的对象添加到当前集合中 。
    public void clear() :清空集合中所有的元素。
    public boolean remove(E e): 把给定的对象在当前集合中删除。
    public boolean contains(Object obj): 判断当前集合中是否包含给定的对象。
    public boolean isEmpty(): 判断当前集合是否为空。
    public int size(): 返回集合中元素的个数。
    public Object[] toArray(): 把集合中的元素，存储到数组中
 */
public class CollectionDemo {
    public static void main(String[] args) {
        // 创建集合对象,以为是要创建实现类通过实现类的方式调用,但是这里进阶了一下使用了多态
        Collection<String> c = new ArrayList<String>();//直接使用多态类型将接口继承
        // public boolean add(E e)：  把给定的对象添加到当前集合中 。
        c.add("hello");//使用多态对象的方式调用时,如果在左侧的多态类/接口中没有这个方法,那么就会报错,但是运行时会看引用的对象中的方法,由于是接口必须重写方法,所以一定可以通过对象的方式调用
        System.out.println(c.add("刘备"));
        System.out.println(c.add("关羽"));
        System.out.println(c.add("张飞"));
        // public boolean remove(E e): 把给定的对象在当前集合中删除。
        System.out.println(c.remove("张飞"));
        // public boolean contains(Object obj): 判断当前集合中是否包含给定的对象。
        System.out.println(c.contains("赵云"));
        // public boolean isEmpty(): 判断当前集合是否为空。
        System.out.println(c.isEmpty());

        // public int size(): 返回集合中元素的个数。
        System.out.println(c.size());
        // public Object[] toArray(): 把集合中的元素，存储到数组中
        Object[] array = c.toArray();
        System.out.println(Arrays.toString(array));
        // public void clear() :清空集合中所有的元素。
        c.clear();
        System.out.println(c);//在将Collection接口中的方法使用完毕之后,可以看到,这些方法都是针对集合中的元素进行操作的,并且这些方法都是使用的多态的方式调用的,所以在使用的时候,一定要注意,如果在多态的左侧没有这个方法,那么就会报错,但是运行时会看引用的对象中的方法,由于是接口必须重写方法,所以一定可以通过对象的方式调用
    }
}
