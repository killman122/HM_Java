package com.itheima.collections_demo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
    Collections类 :单列集合的工具类
        sort方法是一个重载的方法，可以实现自然排序及比较器排序。要特别注意的是sort方法只能对List集合进行排序，方法如下:
        public static <T extends Comparable> void sort(List<T> list )
        需求 : 定义List集合，存储若干整数，进行升序排序

    注意在使用的过程中sort方法限定了泛型的类型，只能是Comparable类型的子类，所以在使用的过程中需要注意
    但是如果在创建的集合中没有指定泛型的类型，那么在调用sort方法的时候就会出现问题，因为此时泛型的类型就是Object类型
    而Object类型是没有实现Comparable接口的，所以在调用sort方法的时候就会出现问题,Object类是所有的子类父类
 */
public class SortDemo1 {
    public static void main(String[] args) {
        //定义集合list
        List<Integer> list = new ArrayList<>();//这里填写Integer作为泛型的内容是可以的，但是填写Object就不行了,并且这里使用了多态的方式进行了引用类
        //向集合中添加元素
        list.add(10);
        list.add(30);
        list.add(20);
        list.add(40);
        list.add(50);
        //由于sort()方法是Collections类的静态方法，所以可以直接调用,这里直接采用类名调用
        //public static <T extends Comparable> void sort(List<T> list )
        System.out.println("未使用sort()方法执行前");
        System.out.println(list);
        System.out.println("使用sort方法排序后");
        Collections.sort(list);//reason: no instance(s) of type variable(s) T exist so that Object conforms to Comparable<? super T>
        System.out.println(list);
        //可以看出在list类型的集合中还是更加趋向于python中的list列表，但是在java中的list列表中的元素类型是可以不一样的

        //如果在创建集合的时候使用的泛型是没有继承Comparable接口的,那么在调用这个sort方法时会出现异常
        ArrayList<Student> list1 = new ArrayList<>();
        list1.add(new Student("张三", 18));
        list1.add(new Student("李四", 18));
        list1.add(new Student("王五", 18));
        list1.add(new Student("赵六", 18));
        System.out.println("list1未使用sort方法排序前");
        System.out.println(list1);
        System.out.println("list1使用sort方法排序后");
//        Collections.sort(list1);//在idea中可以通过使用快捷键f2的方式快速的显示出代码的错误,不需要将光标通过鼠标定位到错误处
        System.out.println(list1);
    }
}
