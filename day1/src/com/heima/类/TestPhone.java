package com.heima.类;

public class TestPhone {
    public static void main(String[] args) {
        Phone phone = new Phone();
        phone.brand = "小米";
        phone.price = 6.66;
        phone.call();
        phone.sendMessage();
    }
}
