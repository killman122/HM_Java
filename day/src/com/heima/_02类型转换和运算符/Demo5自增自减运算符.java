package com.heima._02类型转换和运算符;

/*
    自增运算符++;
        对变量自增
        单独使用: ++在变量的前面或者是在后面都是对变量的自增
        参与运算后置++,先参与操作后自增1
            运算前置++.先自增1操作后参与运算

    自减运算符--;
        对变量自减
        单独使用:--在变量前面或者在变量后面都是对变量的自减
        参与运算后置--,先参与操作后自减1
            运算前置--,先自减1操作后参与运算
 */
public class Demo5自增自减运算符 {
    public static void main(String[] args) {
        int a =10;
//        a++;
//        ++a;
        int b = a++;
        System.out.println(a);
        System.out.println(b);
    }
}
