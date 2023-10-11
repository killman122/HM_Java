package com.heima.类;
/*
    成员变量和局部变量之间的区别:
        代码中的位置:
            成员变量:在类中方法外
            局部变量:在方法定义中或者方法声明上
        在内存中的位置:
            成员变量在堆中
            局部变量在栈中
 */
public class Phones {
    private String name;
    private double price;
    private String productAdderss;

    //提供空参满参的构造方法

    public Phones() {

    }
    public Phones(String name, double price, String productAdderss) {
        int age ;
//        System.out.println(age);
        this.name = name;
        this.price = price;
        this.productAdderss = productAdderss;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    };

    public String getProductAdderss() {
        return productAdderss;
    }

    public void setProductAdderss(String productAdderss) {
        this.productAdderss = productAdderss;
    }
}
