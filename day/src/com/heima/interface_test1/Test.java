package com.heima.interface_test1;
/*
    需求:
        1 创建一个播放接口(Player)
        2 定义三个抽象方法
            播放
            暂停
            停止|终止

        3 定义MP3类,MP4类,手机类,实现播放接口,重写抽象方法
 */
public class Test {
    public static void main(String[] args) {
        MP3 mp3 = new MP3();
        mp3.play();
        mp3.pause();
        mp3.stop();
    }
}

class MP3 implements Player{
    @Override
    public void play() {
        System.out.println("MP3播放音乐");
    }

    @Override
    public void pause() {
        System.out.println("MP3暂停音乐");
    }

    @Override
    public void stop() {
        System.out.println("MP3停止音乐");
    }
}

class MP4 implements Player{
    @Override
    public void play() {
        System.out.println("MP4播放音乐");
    }

    @Override
    public void pause() {
        System.out.println("MP4暂停音乐");
    }

    @Override
    public void stop() {
        System.out.println("MP4停止音乐");
    }
}

class MobilePhone implements Player{
    @Override
    public void play() {
        System.out.println("手机播放音乐");
    }

    @Override
    public void pause() {
        System.out.println("手机暂停音乐");
    }

    @Override
    public void stop() {
        System.out.println("手机停止音乐");
    }
}

//接口-定义规则 不能有方法体=========>子类需要实现接口中的所有方法
interface Player{
    void play();
    void pause();
    void stop();
}