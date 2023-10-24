package com.itheima.stream_demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Stream;

public class StreamDemo5 {
    public static void main(String[] args) {
        Stream.of(1,2,3,4,5,6,7,8,9,10);
        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list,1,2,3,4,5,6,7,8,9,10);
        list.stream().filter(s-> s%2==0).forEach(System.out::println);//在简写的lambda表达式中和python中的lambda表达式的代码块有点相似,不需要指定类型,只考虑结果
        System.out.println(list);//在使用stream流对数据进行更改后,可以发现更改的数据并没有影响到源列表,所以需要Stream的收集操作
    }
}
