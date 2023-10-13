package com.heima.abstract_template;
/*
    模板类:
 */
public abstract class Template {
    public void write(){
        System.out.println("写代码");
        body();

        System.out.println("写代码结束");
    }
    //模板的主题内容,可以自行添加
    public abstract void body();
}
