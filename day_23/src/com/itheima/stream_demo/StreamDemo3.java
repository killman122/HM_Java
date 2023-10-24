package com.itheima.stream_demo;

import javax.xml.stream.FactoryConfigurationError;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

/*
    ### **Stream**流的常见中间操作方法

- Stream<T> filter(Predicate predicate)：用于对流中的数据进行**过滤**

  - Predicate接口中的方法

  - boolean test(T t)：对给定的参数进行判断，返回一个布尔值

- Stream<T> limit(long maxSize)：**截取**指定参数个数的数据

- Stream<T> skip(long n)：**跳过**指定参数个数的数据

- static <T> Stream<T> concat(Stream a, Stream b)：**合并**a和b两个流为一个流

- Stream<T> distinct()：去除流中重复的元素。依赖(hashCode和equals方法)

- Stream<T> sorted () : 将流中元素按照自然排序的规则排序

- Stream<T> sorted (Comparator<? super T> comparator) : 将流中元素按照自定义比较器规则排序
 */
public class StreamDemo3 {
    public static void main(String[] args) {
    //Stream<T> filter(Predicate predicate)：用于对流中的数据进行**过滤**
        //创建Stream流集合
        Stream<String> stream = Stream.of("张无忌", "张翠山", "张三丰", "谢广坤", "赵四", "刘能", "小沈阳", "张良");
        //创建一个集合
        List<String> list = new ArrayList<>();
        Collections.addAll(list, "张无忌", "张翠山", "张三丰", "谢广坤", "赵四", "刘能", "小沈阳", "张良","小沈阳", "张良","小沈阳", "张良");
        //method1_filter(list);
        //method2_limit(list);
        //method3_skip(list);
        //method4_concat(list);
        //method5_distinct(list);
        method6(list);
//        method7(list);
    }

    private static void method1_filter(List<String> list) {
        //过滤
        /*
            在函数式接口中,必须有一个抽象函数被重写实现
            通过查看源码可以查看到,filter方法中有一个参数Predicate类型,再次跳转到该类发现里面只有一个抽象方法boolean test(T t);
            所以必须要实现该抽象方法的重写,并且stream流上数据的多少根据返回值来确定,为true就是转换的集合中的所有元素,为false则相反
            通过下面的forEach()方法调用的输出结果就能够推断出
            filter方法会拿到流中的每一个数据,把流中每一个数据传递给Lambda表达式的形参s,s代表stream流中的每一个元素
            如果返回的是false就丢弃,如果返回的是true就保留
         */
        //将stream流集合中的每个元素中长度等于3的筛选出
        list.stream().filter(s -> s.length() == 3).forEach(System.out::println);
        list.stream().filter((String s)->{return true;});//使用lambda表达式实现方法中的参数,实现filter方法的重写,在重写后想要查看流中的数据,使用.forEach()方法对流中的每个元素进行操作
        /*list.stream().filter((String s)->{return false;}).forEach((String s)->{//当filter中重写方法test(),在jdk中默认重写的返回值为true,相当于直接使用forEach遍历每个元素,当重写的返回值为false相当于没有对stream流中的每个元素进行操作
            System.out.println(s);
        });*/
        //list.stream().filter(s -> s.startsWith("张")).forEach(System.out::println);//由于filter中的参数是Predicate，是一个函数式接口,所以可以使用lambda表达式,可以是使用匿名函数
    }
    //Stream<T> limit(long maxSize)：**截取**指定参数个数的数据
    /*
        截取指定个数的数据,使用limit方法,例如截取list集合中的前5个元素,也就是流中的前5个元素
     */
    private static void method2_limit(List<String> list) {
        //截取
        list.stream().limit(5).forEach(System.out::println);
    }

    //- Stream<T> skip(long n)：**跳过**指定参数个数的数据
    private static void method3_skip(List<String> list) {
        //跳过
        list.stream().skip(5).forEach(System.out::println);//跳过前5个元素在集合中,然后进行输出
    }

    //- static <T> Stream<T> concat(Stream a, Stream b)：**合并**a和b两个流为一个流
    private static void method4_concat(List<String> list) {
        //合并
        Stream<String> limit = list.stream().limit(3);
        Stream<String> skip = list.stream().skip(3);
        Stream<String> concat = Stream.concat(limit, skip);
        System.out.println(concat);
        concat.forEach(System.out::println);
    }

    //- Stream<T> distinct()：去除流中重复的元素。依赖(hashCode和equals方法)
    private static void method5_distinct(List<String> list) {
        //去重
        list.stream().distinct().forEach(System.out::println);
    }

    //- Stream<T> sorted () : 将流中元素按照自然排序的规则排序
    private static void method6(List<String> list) {
        //排序
        list.stream().sorted().forEach(System.out::println);
    }

    //- Stream<T> sorted (Comparator<? super T> comparator) : 将流中元素按照自定义比较器规则排序
    private static void method7(List<String> list) {
        //嗯,之前的方法是直接写在main方法中直接通过ctrl+alt+m的方法进行抽取
//        list.stream().sorted(new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
////                return 0;
//                //如果需要实现降序排序
//                return o2.compareTo(o1);
////                return -o1.compareTo(o2);
////                return o2-o1;//如果是int型数据是能够直接使用两个对象参数之间直接相减的方式获取值似乎是因为包装类中实现了Comparable接口,而不是int类型的数,但是如果不是int类型数据比如说String则不行
//            }
//        });
        list.stream().sorted((String s1,String s2)->{return s2.compareTo(s1);}).forEach(System.out::println);
    }
}
