package com.itheima.test;

import com.itheima.domain.Student;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentManagerSystem {
    public static void main(String[] args) {
        //创建集合容器,用来存储学生对象
        ArrayList<Student> list = new ArrayList<>();//在集合中存储学生的信息,因为集合的底层是数组,数组可以优先扩容,所以优先考虑
        //键盘录入,为什么在主函数中创建键盘录入的对象,而不是在每个方法的使用中创建,答:节约内存空间
        Scanner sc = new Scanner(System.in);
        zz:
        while (true) {//强制退出循环,可以使用对外层循环起别名,然后使用break+别名的方式强制退出循环
            //主页面的编写
            System.out.println("---------欢迎来到学生管理系统---------");
            System.out.println("1 添加学生");
            System.out.println("2 删除学生");
            System.out.println("3 修改学生");
            System.out.println("4 查看所有学生");
            System.out.println("5 退出");
            System.out.println("请输入你的选择:");
            int num = sc.nextInt();
            /**
             * 使用python模拟switch()结构,使用字典的key-value
             * def switch_case(value):
             *     return {
             *         'a': lambda: print("您输入的是字母 a"),
             *         'b': lambda: print("您输入的是字母 b"),
             *         'c': lambda: print("您输入的是字母 c"),
             *     }.get(value, lambda: print("输入错误"))()
             *
             * switch_case('a')  # 触发对应 'a' 的函数
             * switch_case('x)  # 触发默认的函数
             */
            switch (num) {
                case 1:
                    System.out.println("添加学生");
                    addStudent(list, sc);
                    break;
                case 2:
                    System.out.println("删除学生");
                    deleteStudent(list,sc);
                    break;
                case 3:
                    System.out.println("修改学生");
                    updateStudent(list);
                    break;
                case 4:
                    System.out.println("查看所有学生");
                    break;
                case 5:
                    System.out.println("退出");
//                    break zz;
                    System.exit(0);//使用System.exit(0)退出虚拟机,注意这里退出的程度比使用break 外层别名 退出循环的程度要大
                default:
                    System.out.println("您的输入有误,请重新选择");
            }
        }

    }

    private static void updateStudent(ArrayList<Student> list) {

    }

    private static void deleteStudent(ArrayList<Student> list, Scanner sc) {
        //判断集合中的元素是否为空,如果集合中的元素为空,则提示用户,并结束方法
        if (list.isEmpty()) {//list.size() == 0和前面的isEmpty()方法的作用是一样的
            System.out.println("对不起,目前没有学生信息,请添加后再进行删除操作");
            return;
        }
        System.out.println("请输入你要删除的学生的id");
        //输入学生的学号,判断学号是否存在,如果存在则删除,如果不存在则提示用户
        int deleteID = sc.nextInt();
        for (int i = 0; i < list.size(); i++) {
            Student student = list.get(i);//获取集合中的学生对象
            if (student.getId().equals(deleteID)) {//获取学生对象的id属性并和输入的id值进行比较是否相当,如果相等则反馈给用户
                list.remove(i);//删除集合中的学生对象
                System.out.println("要删除的元素存在,删除成功");
                return;
            }
        }
    }

    //添加学生的方法
    private static void addStudent(ArrayList<Student> list, Scanner sc) {
        //提示用户输入要接受的学生信息
        System.out.println("请输入添加到学生学号:");
        String id = sc.next();
        for (int i = 0; i < list.size(); i++) {
            Student student = list.get(i);//获取集合中的学生对象
            if (student.getId().equals(id)) {//获取学生对象的id属性并和输入的id值进行比较是否相当,如果相等则反馈给用户
                System.out.println("您输入的学号已经存在,请重新输入");//在某些情况下直接使用return的空语句比使用if-else语句更加简洁
                return;
            }
        }
        System.out.println("请输入添加到学生姓名:");
        String name = sc.next();
        System.out.println("请输入添加到学生性别:");
        String gender = sc.next();
        System.out.println("请输入添加到学生年龄:");
        int age = sc.nextInt();
        System.out.println("请输入添加学生出生日期:");
        String birthday = sc.next();
        Student student = new Student(id, name, gender, age, birthday);
        list.add(student);
    }
}
