package com.itheima.map_demo.map_demo;
import java.util.HashMap;
import java.util.Set;
/*
    获取key对应的值
        V get(Object key) 返回到指定键所映射的值，或 null如果此映射包含该键的映射
 */
public class MapDemo2 {
    public static void main(String[] args) {
        //创建集合元素
        HashMap<String, String> map = new HashMap<>();
        //向集合中添加元素
        System.out.println(map.put("周瑜", "小乔"));
        map.put("孙策","大乔");
        map.put("刘备","孙尚香");
        map.put("诸葛亮","黄月英");
        //遍历集合
        Set<String> set = map.keySet();//[刘备, 孙策, 诸葛亮, 周瑜]注意map集合中是没有顺序的,都是通过key-value之间的对应找到匹配的key-value
        System.out.println(set.size());
        System.out.println(set);
        for (String s : set) {
            //根据键找到对应的值
            String value = map.get(s);
            System.out.println(s+"-----"+value);
        }//遍历集合输出key-value的键值对
    }
}
