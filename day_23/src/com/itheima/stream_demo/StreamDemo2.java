package com.itheima.stream_demo;

import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/*
  - 单例集合
  - 可以使用Collection接口中的默认方法__stream()__生成流
  - __default Stream<E> stream()__

  - 双例集合
  - 间接的生成流
  - 可以先通过__KeySet__或者__entrySet__获取一个__Set__集合,在获取__Stream__流

  - 数组
  - __Arrays__中的静态方法__stream__生成流
 */
public class StreamDemo2 {
    public static void main(String[] args) {
        //单例集合
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list,"张无忌", "张翠山","张三丰","谢广坤","赵四","刘能","小沈阳","张良");
        //将集合中的元素放入stream流中使用stream流,调用的是单例接口Collections中的默认stream()方法,不需要使用实现类进行重写
        list.stream().forEach(System.out::println);//使用Stream类中的forEach()方法进行遍历,遍历整个Stream流,默认情况下可以直接使用forEach()方法,JDK会默认添加Stream类
        //list.forEach(s -> System.out.println(s));//使用lambda表达式进行遍历,使用下面的lambda表达式中的s->{}的方式,可以改写为上面的直接使用System.out::Println

        //双例集合的遍历,首先使用keySet()方法或者是EntrySet()方法,获取所有的key组成的set集合,或者是使用后者方法获取所有的k-v键值对并存入set集合中
        Map<String, String> map = new HashMap<>();
        map.put("张无忌", "张无忌");
        map.put("张翠山", "张翠山");
        map.put("张三丰", "张三丰");
        map.put("谢广坤", "谢广坤");
        map.put("赵四", "赵四");
        map.put("刘能", "刘能");
        map.put("小沈阳", "小沈阳");
        map.put("张良", "张良");

        //第一种方法使用keySet获取
        Set<String> set = map.keySet();
        System.out.println(set);
        System.out.println(set.getClass().getSimpleName());//使用getClass()方法获取数据的类型也可以加上getSimpleName()方法获取"真正的类型可见的最后一个"
        /*for (String s : set) {
            System.out.println(map.get(s));
        }*/
        set.forEach(s -> System.out.println(s + ":" + map.get(s)));//使用Stream类中的forEach()方法进行遍历,相当于获取的s就是双例集合中的key

        //第二种方式使用entrySet()的方式获取双例集合中的键值对并保存在Set集合中
        Set<Map.Entry<String, String>> entries = map.entrySet();
        System.out.println(entries);
        System.out.println(entries.getClass().getSimpleName());
       /* for (Map.Entry<String, String> entry : entries) {
            System.out.println(entry);
            System.out.println(entry.getClass());
            System.out.println(entry.getValue());
//            System.out.println(entry.getValue());
        }*/
        entries.forEach(entry -> System.out.println(entry.getKey() + ":" + entry.getValue()));

        //数组
        int arr [] = {1,2,3,4,5,6,7};
        IntStream stream = Arrays.stream(arr);
        OptionalInt max = stream.max();
        System.out.println(max.getAsInt());//注意在使用stream类中的方法时,如果已经使用过一次stream流中的某个方法,而如果要再次调用stream中的方法是出现违法状态IllegalStateException异常,需要重新创建stream对象
        IntStream stream1 = Arrays.stream(arr);
        stream1.forEach(System.out::println);

        //把同一种数据类型多个数据放到stream
        //Stream类中的of方法,把多个数据放在stream流上
        Stream<String> stream2 = Stream.of("张无忌", "张翠山","张三丰","谢广坤","赵四","刘能","小沈阳","张良");
        stream2.forEach(System.out::println);
    }
}
