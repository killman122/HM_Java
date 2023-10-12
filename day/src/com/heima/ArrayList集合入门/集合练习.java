package com.heima.ArrayList集合入门;

import javax.jnlp.ClipboardService;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

/*
    使用ArrayList 集合存储5 学生对象 [学号  姓名  性别  年龄  居住地址  考试成绩]
    筛选出成绩大于90的学生,求男生成绩的平均值,求女生成绩的平均值

    学生对象的创建需要键盘录入学生信息创建学生对象,提示: 学号不能重复,可以定义方法判断学号不重复

    1. 创建学生类
    2. 在测试类中创建集合对象,用来添加学生,在添加学生对象到集合中之前判断学号是否可用,筛选成绩大于90 并且男生的平均成绩 筛选成绩大于90 并且女生的平均成绩
 */
public class 集合练习 {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        for (int i=0;i<5;i++) {
            Student student = createStudentObjects(students);
            if (!students.contains(student.getStuId())){
                students.add(student);
            }else {
                System.out.println("出现重复的id,不添加到集合中");
            }
        }

    }

    //创建学生对象并添加到集合中去,注意在函数中添加参数时,需要指定参数的数据类型,即使数据类型是集合泛型也是一样
    private static Student createStudentObjects(ArrayList<Student> students) {//将学生类对象作为返回值的类型,在调用该函数产生学生后返回学生对象所以定义的返回值类型为学生类
        Scanner scanner = new Scanner(System.in);
        String stuId = null;//在从键盘中读入数据时,提前/穿插使用scanner.next()方法能够不读取回车符,避免由于读取回车符在下次调用其余nextXx()方法时退出读取
        while (true) {
            System.out.println("请输入学生的学号");
            stuId = scanner.next();
//        if (students.contains(stuId)){
//        }

            boolean flag = isExistingStudentID(students,stuId);
            if (flag){
                break;//先判断学号是否存在,如果学号已经存在则后面无需在录入学生姓名等信息直接,进入死循环重新输入,如果学号不存在则向下执行
            }else {
                System.out.println("您录入的学号已存在,请重新输入");
            }
        }
        System.out.println("请输入学生的姓名");
        String name = scanner.next();
        System.out.println("请输入学生的年龄");
        int age = scanner.nextInt();
        System.out.println("请输入学生的性别");
        String sex = scanner.next();
        System.out.println("请输入学生的成绩");
        double score = scanner.nextDouble();
        System.out.println("请输入学生的住址");
        String address = scanner.next();
        Student student = new Student(stuId,name,sex,age,address,score);
        //在上面调用构造器后就不需要在使用Setter函数设置成员变量/成员属性
        return student;
    }

    private static boolean isExistingStudentID(ArrayList<Student> students, String stuId) {
        //判断学号是否在集合中存在,如果存在返回false  如果不存在返回true
        for (int i = 0; i < students.size(); i++) {
            Student student = students.get(i);
            if (student.getStuId().equals(stuId)){
                return false;
            }
        }
        return true;
    }

}
