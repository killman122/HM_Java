package com.heima.多态的练习和强转instanceof相关;

public class Test {
    public static void main(String[] args) {
        //父类类型接口类型变量接收子类类型对象
        Player player = new Mp3Player();
        player.play();
        System.out.println(player instanceof Mp3Player);
        System.out.println(player instanceof Player);//通过测试可以知道,在多态的情况下,具有父类的方法和子类的方法(父类方法是由于继承),但是静态变量看父类,不看子类
//        System.out.println(player.num1);
        //方法的参数是一个父类类型,那么可以接收子类类型对象
        usePlayer(new Mp3Player());
    }
    public static void usePlayer(Player player){

    }

    public static Player getPlayer(){
        //方法的返回值是一个父类型,那么可以返回此类型的子类对象
        return new Mp3Player();
    }
}

interface Player { //一个播放器接口
    void play();
    int num1 = 10;
}

class Mp3Player implements Player {
    int num = 10;

    @Override
    public void play() {
        System.out.println("子类播放Mp3");
    } //Mp3播放器

}