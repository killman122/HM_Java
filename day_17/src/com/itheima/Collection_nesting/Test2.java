package com.itheima.Collection_nesting;

import java.util.*;

/*
    List嵌套Map:
    使用场景举例:-年级有多个每个班级有多名学生。要求保存每个班级的学生姓名，姓名有与之对应的学号，保存一年级所有的班级信息。
    思路:
    1 可以使用Map集合保存一个班级的学生(键是学号，值是名字)
    2 可以使用List集合保存所有班级
    因此我们可以定义集合如下:
    班级: Map<String,string> 健是学号
    举例 :
    Map<String,String>三年一班 = {it001 = 迪丽热巴 ，it002 = 娜扎,it003 = 马尔扎哈 ,it004 = 欧阳娜娜}
    Map<String,String>三年二班 ={it01= 李小璐 ，t002 =白百何，t003 = 马蓉}
    Map<String,String> 三年三班 = {it001= 林丹,it002 =文章，it003 = 陈赫}
    年级:List<Map<String,string>> 保存每个班级的信息
    举例 :
        List<Map<String,String>> 年级 = {三年一班，三年二班，三年三班}
 */
public class Test2 {
    public static void main(String[] args) {
        //创建年级集合
        List<HashMap<String, String>> 年级 = new ArrayList<>();
        //创建班级集合
        HashMap<String, String> 三年一班 = new HashMap<>();
        HashMap<String, String> 三年二班 = new HashMap<>();
        HashMap<String, String> 三年三班 = new HashMap<>();
        //添加元素
        三年一班.put("it001", "迪丽热巴");
        三年一班.put("it002", "古力娜扎");
        三年一班.put("it003", "马尔巴札");
        三年一班.put("it004", "欧阳娜娜");
        三年二班.put("it001", "李小璐");
        三年二班.put("it002", "白百何");
        三年二班.put("it003", "马蓉");
        三年三班.put("it001", "林丹");
        三年三班.put("it002", "文章");
        三年三班.put("it003", "陈赫");
        年级.add(三年一班);
        年级.add(三年二班);
        年级.add(三年三班);
//        Collections.addAll(年级, 三年一班, 三年二班, 三年三班);
        //遍历年级集合
        for (HashMap<String, String> map : 年级) {
            System.out.println(map);
            Set<String> set = map.keySet();//获取key
            for (String s : map.keySet()) {//获取key的集合在通过key获取value使用get(key),或者是获取键值对象的集合,在通过getKey(),getValue()
                System.out.println(s + ":" + map.get(s));//打印的结果中班级是有序的,因为班级通过list单例有序集合存储,但是打印结果中的人物信息是无序的,因为人物通过双例集合Mao存储,是一个无序集合
            }
        }

    }
}
