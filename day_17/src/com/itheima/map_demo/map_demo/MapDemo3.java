package com.itheima.map_demo.map_demo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/*
    创建Map集合对象 , 往集合中添加以下三对元素 , 使用获取Entry对象集合,在找到键和值 遍历集合
    张无忌  --  赵敏
    张翠山  --  殷素素
    张三丰  --  郭芙

 */
public class MapDemo3 {
    public static void main(String[] args) {
        //创建Map集合对象
        Map<String, String> map = new HashMap<>();//使用多态的方式,当然也可以直接使用实现类对象
        //向集合中添加三对元素
        map.put("张无忌","赵敏");
        map.put("张翠山","殷素素");
        map.put("张三丰","郭芙");
        //获取entry对象集合,找到对应的键和值,遍历
        Set<Map.Entry<String, String>> entries = map.entrySet();//在entrySet方法中返回的是一个Set集合,集合中的泛型是Map接口的Entry内部类(实质上也是一个接口)外部接口的内部接口,所以需要加上外部类名修饰来调用接口中的方法,并且需要加入泛型的约束,约束条件和外部Map集合的泛型条件相同
        //set集合中存储的都是Entry类型的对象
        System.out.println(entries);
        //使用增强for循环的方式遍历entries集合中的元素
        for (Map.Entry<String, String> entry : entries) {
            String value = entry.getValue();
            System.out.println(entry);
            System.out.println(value);
        }
        //使用迭代器的方式遍历
        Iterator<Map.Entry<String, String>> iterator = entries.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
