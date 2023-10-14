package com.heima.ArrayList集合入门;
import com.heima.String.Student;
import java.util.ArrayList;
/*
    1.打开api搜索ArrayList
        包结构:java.util.ArrayList<E>
        类结构:public class ArrayList<E> extends AbstractList<E> implements List<E>, RandomAccess, Cloneable, Serializable
    2.描述
        组成:可调整大小的数组的实现List接口
    3.构造方法/构造器
        ArrayList()  构造一个初始容量为十的空列表
        ArrayList(Collection<? extends E> c) 构造一个包含指定集合的元素的列表，按照它们由集合的迭代器返回的顺序
        ArrayList(int initialCapacity) 构造具有指定初始容量的空列表       .但是由于集合可以自动扩容,所以单个使用ArrayList(int initialCapacity)构造器没有意义
        集合ArrayList在原有的空间上自动扩容时增加1.5倍
    4.常用方法
        boolean     add(E e)                    将指定的元素追加到此列表的末尾
        <泛型> 用来约束集合中的存储的数据类型    格式: 类名<数据类型>    泛型的方法不仅仅局限于在集合当中使用
        void        add(int index, E element)   在此列表中的指定位置插入指定的元素
          E           get(int index)            返回此列表中指定位置的元素   获取集合中的元素,这里指的是主要通过索引值下标定位元素位置
         E          set(int index, E element)   用指定的元素替换此列表中指定位置的元素。
 */
public class Demo1 {
    public static void main(String[] args) {
        ArrayList<Object> arrayList = new ArrayList<>();
        System.out.println(arrayList); //使用[]表示一个空的数组,但是感觉上空的数组更像是Java中的列表的样式(这里只是外观不是变量的类型等)
        ArrayList arrayList1 = new ArrayList(22);
        System.out.println(arrayList1);
        arrayList.add("张三");
        arrayList.add("王道");
        arrayList.add(100);
        arrayList.add(true);
        arrayList.add('啥');
        arrayList.add("无敌");
        arrayList.add(11.22);
        System.out.println(arrayList);

        int arr[] = new int[10];
        ArrayList<String> lists = new ArrayList<>();//对集合的约束在Java中叫做泛型,这里约束全部为String类型的数据,<>尖括号内中的数据叫做泛型
        lists.add("张阿森纳");
        //实际上在使用了泛型约束后,只有<>内泛型指定的数据类型的变量/参数能够填写进集合中,后面的add方法就是错误的,但是可以使用String类中的方法 valueOf()方法将不同类型的数据转换为String类型的数据
        //lists.add(100);
        lists.add("里斯");
        lists.add("王道");
        lists.add("王三思");
        lists.add("王后行");
        lists.add("王傲天");
        lists.add("王蜜桃");
        lists.add("王老幺");
        lists.add(String.valueOf(100));//使用String.valueOf()方法将不同类型的数据,转换为String类型的数据
        lists.add(9,"奥力给");//如果索引超出范围（ index < 0 || index > size() ）
        lists.add(0,"wote");//如果索引超出范围（ index < 0 || index > size() ）
        lists.add(0,"wote1");//如果索引超出范围（ index < 0 || index > size() ）
        lists.add(0,"wote2");//如果索引超出范围（ index < 0 || index > size() ）
        System.out.println(lists);

        Student student = new Student();
        student.setAge(21);
        ArrayList<Student> students = new ArrayList<>();
        students.add(student);
        System.out.println(students);
//      E       get(int index)      返回此列表中指定位置的元素
        //返回索引中元素的取值
        System.out.println(lists.get(0));//在不进行赋值的情况下直接对集合中的数据通过get()方法进行获取,在通过使用sout的方式直接打印输出,注意在打印的时候不能添加赋值,否则会程序异常
        System.out.println("------------------------------------");
        //获取集合中所有的元素    底层是数组,是数组就有索引
        //for循环遍历集合输出集合中的每一个元素
        String 王道无敌编程 = lists.set(0, "王道无敌编程");//返回的是替换的元素,也就是原来的元素在替换之前
        System.out.println(王道无敌编程);
        for (int i = 0; i < lists.size(); i++) {
            System.out.println(lists.get(i));
        }

        //求集合中存储元素的个数 size()

    }
}
