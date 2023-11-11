package com.itheima.tcp2;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/*
    目标：实现一个服务端可以同时接收多个客户端的请求，客户端可以同时发送多条数据
 */
public class Server {
    public static void main(String[] args) throws IOException {
        System.out.println("启动服务端成功!");
        //创建ServerSocket对象，注册端口号
        ServerSocket serverSocket = new ServerSocket(8888);
        while (true){
            //使用ServerSocket对象中的方法accept，获取到请求的客户端对象Socket,等待客户端的连接请求
            Socket socket = serverSocket.accept();//这里的主线程只是负责连接管道,连接后将管道分配给子线程
            //把这个客户端对应的socket通信管道, 交给一个独立的线程进行处理, 每个线程对应一个客户端连接
            new ServerThread(socket).start();
        }
    }
}
