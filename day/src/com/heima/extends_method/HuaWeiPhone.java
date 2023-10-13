package com.heima.extends_method;

public class HuaWeiPhone extends Phone {
    @Override
    public void call(String name) {//重写父类方法,既可以增加新的功能也可以保证父类的功能
        System.out.println("开启视频通话");
        super.call(name);
    }
    //私有的方法无法进行重写
    public void method(){
        System.out.println("method");
    }
}
