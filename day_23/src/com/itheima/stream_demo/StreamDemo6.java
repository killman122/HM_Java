package com.itheima.stream_demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StreamDemo6 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list,"张无忌","张翠山","张三丰","谢广坤","赵四");
        /*
            stream流中收集方法
            R collect(Collector collector) : 此方法只负责收集流中的数据,创建集合添加数据动作需要依赖于参数,例如参数是Collectors.toList()|Collectors.toSet()|Collectors.toMap()

            工具类Collectors提供了具体的收集方式,可以获取到Collector对象并可以将对象传入到上面的收集方法collect()中,通过类调用下面的静态方法获取Collector接口返回值

            - public static <T> Collector toList()：把元素收集到List集合中

            - public static <T> Collector toSet()：把元素收集到Set集合中

            - public static Collector toMap(Function keyMapper,Function valueMapper)：把元素收集到Map集合中
         */
//        Collector<Object, ?, List<Object>> collector = Collectors.toList();将Collector对象的获取直接填入下方的collect收集方法中,自动转换上面的collector中的泛型限定
        List<String> collect = list.stream().filter(s -> s.length() == 3).collect(Collectors.toList());//此时流中应该是有4个元素,四个元素的长度都为3
        //List<String> collect1 = (List<String>) list.stream().filter(s -> s.length() == 3).collect(Collectors.toSet());//此时流中应该是有4个元素,四个元素的长度都为
        System.out.println(collect);
        Set<String> set = list.stream().skip(2).collect(Collectors.toSet());//跳过前2个元素在集合中,然后进行输出
        System.out.println(set);
    }
}
