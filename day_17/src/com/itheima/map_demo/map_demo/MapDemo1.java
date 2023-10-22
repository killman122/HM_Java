package com.itheima.map_demo.map_demo;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo1 {
    public static void main(String[] args) {
        //创建Map集合对象
        Map<String,String> map = new HashMap<>();//在引用的父类/接口中编写了泛型,在后面的子类实现中就不需要在指定泛型
        System.out.println(map.put("文章", "马伊琍"));//返回null表示元素添加成功
        System.out.println(map.put("文章", "王菲"));//在put过一个key和对应的value后,在次put key和更新后的value返回的是修改后的键对应的值
        map.put("谢霆锋", "王菲");
        map.put("李亚鹏", "王菲");//put方法不仅能添加也能够修改Map集合中的元素
        System.out.println(map.containsKey("wangdao"));//判断集合中是否含有一个键名叫做"wangdao"的map集合
        System.out.println(map);
        System.out.println(map.get("文章"));
        System.out.println(map.remove("李亚鹏"));//返回的是删除后的键的值
        System.out.println(map.remove("wangdao"));//在没有删除的key存在于Map集合中时,返回的是一个null空
        System.out.println(map);
//        public Set<K> keySet(): 获取Map集合中所有的键，存储到Set集合中。   该方法返回值是一个Set集合,获取了Map集合中的所有的键
        Set<String> set = map.keySet();
        System.out.println(set);
    }
}
