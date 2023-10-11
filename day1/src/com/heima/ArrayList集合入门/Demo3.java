package com.heima.ArrayList集合入门;

import com.heima.String.Student;

import java.util.ArrayList;

/*
    list集合存Student 对象并遍历获取每一个学生的姓名和年龄
    步骤:
        1.创建集合对象
        2.创建学生对象
        3.把学生对象添加到集合中
        4.遍历集合获取学生对象,使用9学生getXX的方法获取学生的信息   输出到控制台
 */
public class Demo3 {
    public static void main(String[] args) {
        //创建集合对象
        ArrayList<Student> students = new ArrayList<>();
        //创建学生对象
        Student student = new Student("张三0","男",21);
        Student student1 = new Student("里斯","男",21);
        Student student2 = new Student("李四","男",21);
        Student student3 = new Student("李斯","男",21);
        Student student4 = new Student("丽丝","男",21);
        Student student5 = new Student("莉丝","男",21);
        Student student6 = new Student("李思","男",21);
        Student student7 = new Student("王五","男",21);
        Student student8 = new Student("王武","男",21);
        Student student9 = new Student("汪芜","男",21);
        students.add(student);
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);
        students.add(student6);
        students.add(student7);
        students.add(student8);
        students.add(student9);
        //遍历集合获取学生对象,使用9学生getXX的方法获取学生的信息   输出到控制台
        //求集合中所有人的年龄和
        int sum = 0;
        for (Student st : students) {
            System.out.println(st.getName()+st.getAge()+st.getSex());
//            System.out.println(st.getAge());
//            System.out.println(st.getSex());
            System.out.println(st.getAge());
            sum+=st.getAge();
        }
        System.out.println("所有人的年龄和是"+sum);

    }
}
