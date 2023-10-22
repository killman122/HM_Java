package com.itheima.map_demo.map_test;

import java.util.HashMap;
import java.util.Set;

public class HashMap_Demo1 {
    public static void main(String[] args) {
        //创建HashMap集合,按照原教程使用的是Character表示字
        HashMap<Character, Integer> hashMap = new HashMap<>();
        //创建字符串对象
        String str = "aabbccdrf";
        //方式1使用类似于python中字典的循环遍历外加get方法
        //向集合中添加元素
//        for (int i = 0; i < str.length(); i++) {//python中是对序列中的每个元素进行迭代,而不是像Java中一样基于索引迭代
//            System.out.println(str.charAt(i));//在python中可以for i in str:print(i)的方式输出,但是在Java中可以使用字符串直接for的形式
//            hashMap.put(str.charAt(i), hashMap.getOrDefault(str.charAt(i), 0) + 1);//这里使用的方法和python中字典直接使用get方式的默认子方法很相似,在键不存在于Map中返回默认值0,否则继续加1
//        }
        //方式2使用黑马的方法containsKey
        for (int i = 0; i < str.length(); i++) {
            //根据索引获取字符串中的每一个字符
            char ch = str.charAt(i);
            if (hashMap.containsKey(ch)) {
                //表示字符在集合中存在
                hashMap.put(ch, hashMap.get(ch) + 1);//获取到集合的key对应的value并将value值+1
            }else {
                //表示字符在集合中不存在
                hashMap.put(ch, 1);//将key对应的value设置为1,为字符进行第一次的初始化赋值
            }
        }

        //采用StringBuilder作拼接成效果为a(5) b(4) c(3) d(2) e(1)
        StringBuilder sb = new StringBuilder();
        Set<Character> set = hashMap.keySet();
        for (Character key : set) {
            Integer value = hashMap.get(key);
            sb.append(key).append("(").append(value).append(")");//拼接字符串
        }
        System.out.println(sb);//默认调用toString方法将StringBuilder转换为String
        /*
            public V getOrDefault(Object key,   V defaultValue)说明从界面： Map复制
            返回到指定键所映射的值，或 defaultValue如果此映射包含该键的映射。
            Specified by:
            getOrDefault在界面 Map<K,V>
            参数
            key - 要返回其关联值的键
            defaultValue - 键的默认映射
            结果
            指定键映射到的值，如果此映射不包含该键的映射， defaultValue

            hashMap.put(str.charAt(i), hashMap.getOrDefault(str.charAt(i), 0) + 1);
            这个表达式实际上是将所获取的次数加1，即如果单词已存在于count容器中，则在其原有的出现次数（也就是getOrDefault方法得到的结果）基础上加1；如果单词不存在(count.get(word)返回null),则返回默认值0,加1后变成1，表示新单词出现的次数。
count.put(word, count.getOrDefault(word, 0) + 1): 这个语句将键为word和值为count.getOrDefault(word, 0) + 1的键-值对放入count中。如果count已经包含了一个键为word的键值对，那么该键值对的值就会被新值替换。
         */
        System.out.println(hashMap);
    }
}
