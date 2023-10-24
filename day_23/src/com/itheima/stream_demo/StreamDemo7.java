package com.itheima.stream_demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

/*
     创建一个ArrayList集合，并添加以下字符串。字符串中前面是姓名，后面是年龄

    “zhangsan，23”

    “lisi，24”

    “ wangwu，25”

    保留年龄大于等于24岁的人，并将结果收集到Map集合中，姓名为键，年龄为值

    public static Collector toMap(Function keyMapper ,  Function valueMapper)：把元素收集到Map集合中
 */
public class StreamDemo7 {
    public static void main(String[] args) {
//        ArrayList<Map<String, Integer>> list = new ArrayList<>();
////        list.add(new HashMap<String, Integer>() {{
////            put("zhangsan", 23);
////        }});
//        Collections.addAll(list, new HashMap<String, Integer>() {{
//            put("lisi", 23);
//            put("lisi", 24);
//            put("wangwu", 25);
//        }});
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "zhangsan,23", "lisi,24", "wangwu,25");
        Map<String, Integer> map = list.stream().filter(s -> {
            String s1 = s.split(",")[1];
            return Integer.parseInt(s1) >= 24;//toMap()函数中需要两个函数式接口的值,所以传入两个lambda表达式的值,并且返回两个值,一个是当前泛型中的键,一个是当前泛型中的值value
        }).collect(Collectors.toMap(//s表示流中的每一个数据
                (String s) -> {//由于流中的数据是String类型的,所以需要为两个lambda表达式中的参数值传递两个值,并且参数的值和流中的参数的值的类型相同
                    //作为map集合中的键
                    return s.split(",")[0];
                }, (String s) -> {
                    //作为map集合中的值
                    return Integer.parseInt(s.split(",")[1]);//将原本的返回值String类型转换为Integer类型,使用Integer.parseInt()方法
                }));//toMap()函数中需要两个函数式接口的值,所以传入两个lambda表达式的值,并且返回两个值,一个是当前泛型中的键,一个是当前泛型中的值value

        System.out.println(map);
    }
}
