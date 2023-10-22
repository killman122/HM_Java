package com.itheima.Collection_nesting;

import java.util.Collections;
import java.util.HashMap;
import java.util.Set;

/*
    Map嵌套Map
    使用场景举例:一个年级多个班级，每个班级有多名学生。要求保存每个班级的学生姓名，姓名有与之对应的学号,保存一年级所有的班级信息，班级有与之对应的班级名称。
    思路:
    可以使用Map集合保存一个班级的学生(键是学号，值是名字)
    可以使用Map集合保存所有班级(健是班级名称，值是班级集合信息)
    因此我们可以定义集合如下:
    班级: Map<String ，string> 键:学号，值:姓名
    举例 :
    Map<String,String> 三年一班 = {it001 = 迪丽热巴 ，it002 = 力娜扎 it003 = 马尔扎 it004 = 欧阳娜娜}
    Map<String,String> 三年二班 = {it001 = 李小璐，it002 = 白百何，it003 = 马蓉}
    Map<String,string> 三年三班 ={it001 = 林丹,it002 =文章，it003 = 陈赫}
    年级: Map<String ，Map<String,string>> 健: 班级名称，值:具体班级信息
    举例:
    Map<String，Map<String,String>> 年级 = {"三年一班"=三年一班，"三年二班"=三年二班，"三年三班"=三年三班}
 */
public class Test3 {
    public static void main(String[] args) {
        //创建年级集合对象
        HashMap<String, HashMap<String, String>> 年级 = new HashMap<>();
        //创建班级集合对象
        HashMap<String, String> 三年一班 = new HashMap<>();
        HashMap<String, String> 三年二班 = new HashMap<>();
        HashMap<String, String> 三年三班 = new HashMap<>();
        //添加元素
        三年一班.put("it001", "迪丽热巴");
        三年一班.put("it002", "力娜扎");
        三年一班.put("it003", "马尔扎");
        三年一班.put("it004", "欧阳娜娜");
        三年二班.put("it001", "李小璐");
        三年二班.put("it002", "白百何");
        三年二班.put("it003", "马蓉");
        三年三班.put("it001", "林丹");
        三年三班.put("it002", "文章");
        三年三班.put("it003", "陈赫");
        //添加元素,在添加元素时不能使用Collections工具类
        年级.put("三年一班", 三年一班);
        年级.put("三年二班", 三年二班);
        年级.put("三年三班", 三年三班);
        //遍历集合
        Set<String> 班级名字集合 = 年级.keySet();
        for (String 班级 : 年级.keySet()) {//注意这里的班级集合和年级集合都是Map双例集合无序
            System.out.println(班级);
            System.out.println(年级.get(班级));
            HashMap<String, String> stringStringHashMap = 年级.get(班级);
            Set<String> 学号集合 = stringStringHashMap.keySet();
            for (String 学号 : 学号集合) {
                System.out.println(学号 + ":" + stringStringHashMap.get(学号));
            }
        }
    }
}
