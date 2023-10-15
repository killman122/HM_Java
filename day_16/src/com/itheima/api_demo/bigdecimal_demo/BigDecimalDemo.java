package com.itheima.api_demo.bigdecimal_demo;

import java.math.BigDecimal;

public class BigDecimalDemo {
    public static void main(String[] args) {
        BigDecimal bigDecimal = new BigDecimal("0.1");
        BigDecimal bigDecimal1 = new BigDecimal("0.1");
        System.out.println(bigDecimal.add(bigDecimal1));//这里在构造函数中传入小数的字符串形式进行运算时不会导致精度的丢失
        BigDecimal result = bigDecimal.add(bigDecimal1);
        BigDecimal bigDecimal2 = new BigDecimal(10);
        BigDecimal bigDecimal3 = new BigDecimal(3);
        //System.out.println(bigDecimal2.divide(bigDecimal3));//divide方法在调用时如果除不尽就会出现参数异常的警告ArithmeticException,解决方案使用另一种参数类型的divide除法
        //public BigDecimal divide(BigDeciaml divisor,int scale,int roundingMode)
        System.out.println(bigDecimal2.divide(bigDecimal3, 3, BigDecimal.ROUND_FLOOR));//保留3位精度的小数,并使用去尾法对3位小数后的小数位数进行处理

    }
}
