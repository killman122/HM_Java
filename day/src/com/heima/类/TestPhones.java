package com.heima.类;

public class TestPhones {
    public static void main(String[] args) {
        Phones phones = new Phones();
        phones.setName("小米");
        phones.setPrice(1234);
        phones.setProductAdderss("中国");
        System.out.println(phones.getName()+phones.getPrice()+phones.getProductAdderss());
    }
}
