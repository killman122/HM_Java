package com.itheima.genericity_demo.list_demo;

import java.util.ArrayList;
import java.util.List;

/*
    Collection按口
        - List
        - Set
    List接口的特点:
        - 有序(存储和取出的元素顺序一致)
        - 可重复
        - 有索引
 */
public class Demo1_List {
    public static void main(String[] args) {
        //由于List是接口不能创建对象,所以只能通过实现类的方法调用接口中的方法,但是为了各个实现类之间的方法独立,所以使用多态的方式调用接口中的方法
        List<String> list = new ArrayList<>();//ArrayList集合和python中列表还是非常相似的
        list.add("热巴");
        list.add("迪丽热巴");
        list.add("阿西巴");
        list.add("欧阳那哈");
        list.add("欧阳那哈");
        System.out.println(list);
    }
}
