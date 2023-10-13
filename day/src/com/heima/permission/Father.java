package com.heima.permission;

public class Father {
    public void show0(){}
    protected void show1(){}
    void show2(){}
    private void show3(){}

    public void method(){
        show0();
        show2();
        show3();
        show1();
    }

}
