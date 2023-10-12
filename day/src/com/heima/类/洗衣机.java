package com.heima.类;

public class 洗衣机 {
    String 品牌;
    double 价格;
    public void 洗衣服(){
        System.out.println("一个会中文的洗衣机在洗衣服");
    }

    public static void main(String[] args) {
        洗衣机 洗衣机1 = new 洗衣机();
        洗衣机1.洗衣服();
        洗衣机1.品牌 = "海尔";
        洗衣机1.价格 = 1000;
        System.out.println(洗衣机1.品牌+洗衣机1.价格);
    }
}
