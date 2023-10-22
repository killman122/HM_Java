package com.itheima.map_demo.map_test;

import java.util.HashMap;
import java.util.Set;

/*
    需求
        存储数据，每位学生《姓名，年龄) 都有自己的家庭住址。
        学生和地址有对应关系，将学生对象和家庭住址存储到map集合中。学生作为键，家庭住址作为值。
        要求:学生姓名相同并且年龄相同视为同一名学生，不能重复存储
        集合中存储的元素 :
        Student s1 = new student("迪丽热巴"，18);
        Student s2 = new student("古力娜扎"，20);
        student s3 = new student("马尔扎哈"，10);
        student s4 = new student(“马尔扎哈"，10);
        注意: HashMap集合,要想保证键唯一，那么键所在的类必须重写hashCode和equals方法!!!
    分析 :
    1 创建学生类 :名字 ，年龄
    2 创建HashMap集合，HashMap< student ，string >
    3添加元素
    4遍历
 */
public class HashMap_Demo {
    public static void main(String[] args) {
        Student student = new Student("王道", 21);
        HashMap<Student, String> map = new HashMap<>();
        Student s1 = new Student("迪丽热巴",18);
        Student s2 = new Student("古力娜扎",20);
        Student s3 = new Student("马尔扎哈",10);
        Student s4 = new Student("马尔扎哈",10);
        //向集合对象中添加元素
        map.put(student, "新疆");
        map.put(s1, "新疆");
        map.put(s2, "新疆");
        map.put(s3, "虚空");
        map.put(s4, "峡谷");//再通过重写hashCode和equals方法可以实现去重的功能,注意重写是在集合中存储的数据的类
        //遍历集合
        Set<Student> students = map.keySet();
        for (Student student1 : students) {//这里的student1是集合中的每个key
            String s = map.get(student1);//这里是调用Map接口中的方法get  V get(Object key) 返回到指定键所映射的值，或 null如果此映射包含该键的映射。
            System.out.println(student1+"-----"+s);
        }
    }
}
