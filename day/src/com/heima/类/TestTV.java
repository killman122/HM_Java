package com.heima.类;

public class TestTV {
    public static void main(String[] args) {
        //创建电视对象
        TV tv = new TV();
        tv.brand = "TCL液晶";
        tv.price = 8889;
        String brand = tv.brand;
        double price = tv.price;
            System.out.printf("品牌"+brand+"价格"+price);
        tv.watchTv();
    }
}
