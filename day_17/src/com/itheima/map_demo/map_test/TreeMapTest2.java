package com.itheima.map_demo.map_test;

import java.util.Comparator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/*
    需求 : 创建一个TreeMap集合，键是学生对象(Student)，值是籍贯(string).
    学生 : 属性姓名和年龄，要求按照年龄进行升序排序并遍历
    备用代码
        Student s1 = new student("迪丽热巴”，18);
        student s2 = new student("古力娜扎"，20);
        student s3 = new student(“马尔扎哈"，10);
        Student s4 = new Student("马尔扎哈"，10);
        tm.put(s1 ，"新疆");
        tm.put(s2，“新疆");
        tm.put(s3，"虚空");
        tm.put(s4 ，"峡谷”);
 */
public class TreeMapTest2 {
    public static void main(String[] args) {
        Student s1 = new Student("迪丽热巴", 18);
        Student s2 = new Student("古力娜扎", 20);
        Student s3 = new Student("马尔扎哈", 10);
        Student s4 = new Student("马尔扎哈", 10);
        //创建集合对象
        TreeMap<Student, String> treeMap = new TreeMap<>(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
//                return 0;
                int result = -o1.compareTo(o2);//在这里加上负号,表示降序排序,否则是升序
                return result == 0 ? -o1.getName().compareTo(o2.getName()) : result;//并且在比较器排序和自然排序方式同时存在时,优先选择比较器排序
            }
        });//比较器排序,让集合接收一个Comparator接口的实现类对象,可以使用匿名内部类
        //向集合中添加元素
        treeMap.put(s1, "新疆");
        treeMap.put(s2, "新疆");
        treeMap.put(s3, "虚空");
        treeMap.put(s4, "峡谷");
        //遍历集合
        Set<Map.Entry<Student, String>> entries = treeMap.entrySet();//返回一个key-value的键值对集合
        for (Map.Entry<Student, String> entry : entries) {
            Student key = entry.getKey();//获取键
            String value = entry.getValue();//获取值
            System.out.println("key: " + key + " value: " + value);
        }
        System.out.println(entries);//可以输出发现TreeSet集合也具有去重的功能
        //报错.ClassCastException的原因是由于集合需要排序,但是默认情况是按照key的值进行排序,但是这里的key都是字符串没有像Integer的自动排序,Java在内部实现类继承Comparable接口，所以可以实现自己的排序规则
        //通过集合中的元素的类进程Comparable接口,实现自然排序
    }
}
