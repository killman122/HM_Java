package com.itheima.api_demo.biginteger_demo;

import java.math.BigInteger;

/*
    BigInteger类的使用
    public class BigInteger extends Number implements Comparable<BigInteger>
    构造方法:
        public BigInteger(String value)   : 可以将BigInteger的十进制字符串表示形式转换为BigInteger对象
    成员方法:
        public BigInteger add(BigInteger val)  返回值为 (this + val)
        public BigInteger subtract(BigInteger val)  返回值为 (this - val)
        public BigInteger multiply(BigInteger val)   返回值为 (this * val)
        public BigInteger divide(BigInteger val)    返回值为 (this / val)

 */
public class BigIntegerDemo {
    public static void main(String[] args) {
        /*int num = 2147483647;
        System.out.println(num+1);*/
        //当数值过大超过了变量的取值范围后,又回到最小的取值范围处,但是如果需要保存更大的数据怎么办?使用BigInteger大整型数据
        //分别执行加减乘除4种方式调用
        BigInteger bigInteger = new BigInteger("2147483647");
        BigInteger result = bigInteger.add(new BigInteger("100"));
        System.out.println(result);
        result = result.subtract(new BigInteger("100"));
        System.out.println(result);
        result = result.multiply(new BigInteger("2"));
        System.out.println(result);
        result = result.divide(new BigInteger("2"));
        System.out.println(result);
    }
}
