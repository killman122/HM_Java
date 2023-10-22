package com.itheima.Collection_nesting;

import java.util.ArrayList;
import java.util.Collections;

/*
    List嵌套List
    使用场景举例:一年级有多个班级，每个班级有多名学生。要求保存每个班级的学生姓名，保存一个年级所有的班级信息
    思路:
    可以使用List集合保存一个班级的学生
    可以使用List集合保存所有班级
    因此我们可以定义集合如下:
    班级:List<string>
    举例:
    List<string> 三年一班 = {迪丽热巴，古力娜扎,马尔扎哈,欧阳娜娜}
    List<String> 三年二班 = {白百何,李小璐，马蓉}
    List<String> 三年三班 = {林丹，文章，陈赫}
年级:List<List<String>>
举例 :
List<List<String>> 年级 ={三年一班 ，三年二班 ，三年三班}
 */
public class Test1 {
    public static void main(String[] args) {
        //创建年级的集合,并且是一个嵌套集合
        ArrayList<ArrayList<String>> 年级 = new ArrayList<>();
        //创建班级集合,在创建集合完毕向集合中添加元素时使用工具类Collections,工具类中有许多操作常用变量的方法,这些方法都是静态的
        ArrayList<String> 三年一班 = new ArrayList<>();// ArrayList是一个用于存储和处理数据的类，而Collections是一个包含有用静态方法的工具类，这些方法可用于操作和修改集合。
        Collections.addAll(三年一班, "迪丽热巴", "古力娜扎", "马尔扎哈", "欧阳娜娜");
        ArrayList<String> 三年二班 = new ArrayList<>();// ArrayList是一个用于存储和处理数据的类，而Collections是一个包含有用静态方法的工具类，这些方法可用于操作和修改集合。
        Collections.addAll(三年二班, "白百合", "李小璐", "马蓉");
        ArrayList<String> 三年三班 = new ArrayList<>();// ArrayList是一个用于存储和处理数据的类，而Collections是一个包含有用静态方法的工具类，这些方法可用于操作和修改集合。
        Collections.addAll(三年三班, "林丹", "文章", "陈赫");
        //向嵌套集合年级中添加元素,这里也使用工具类中的方法
        Collections.addAll(年级, 三年一班, 三年二班);
        //使用一般的方式向集合中添加元素
        年级.add(三年三班);
        System.out.println(年级);

        //遍历年级嵌套集合,通用单例集合List的遍历方式增强for,普通for,迭代器
        for (ArrayList<String> list : 年级) {//第一层遍历班级,第二层遍历学生
            for (String s : list) {
                System.out.println(s);
            }
        }
    }
}
