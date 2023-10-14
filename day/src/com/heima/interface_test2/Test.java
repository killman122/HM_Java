package com.heima.interface_test2;

public class Test {
    public static void main(String[] args) {
        StudyBoy studentBoy = new StudyBoy("王道", 21);
        StudyGirl studentGirl = new StudyGirl("王小花", 18);
        PlayBoy playBoy = new PlayBoy("王小二", 20);
        PlayGirl playGirl = new PlayGirl("王晓梅",18);
        studentBoy.study();
        studentGirl.study();
        playBoy.playBasketBall();
        playBoy.study();
        studentGirl.study();
        
    }
}
