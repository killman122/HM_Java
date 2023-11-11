package com.itheima.tcp2;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;

public class ServerThread extends Thread{
    private Socket socket;
    public ServerThread(Socket socket){//创建一个带参Socket对象的构造器
        this.socket = socket;
    }
    @Override
    public void run() {
        try {//获取到一个低级的字节输入流, 在将这个字节输入流包装为高级的数据输入流
            InputStream inputStream = socket.getInputStream();
            DataInputStream dataInputStream = new DataInputStream(inputStream);
            while (true){
                String s = dataInputStream.readUTF();
                System.out.println(s);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
