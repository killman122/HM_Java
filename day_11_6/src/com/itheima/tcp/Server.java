package com.itheima.tcp;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

/*
    TCP通信的服务器端：接收客户端的请求，读取客户端发送的数据，给客户端回写数据

    表示服务器的类：
        java.net.ServerSocket：此类实现服务器套接字。

    构造方法：
        ServerSocket(int port) 创建绑定到特定端口的服务器套接字。

    服务器端必须明确一件事情，必须的知道是哪个客户端请求的服务器
    所以可以使用accept方法获取到请求的客户端对象Socket

    成员方法：
        Socket accept() 侦听并接受到此套接字的连接。

    服务器的实现步骤：
        1.创建服务器ServerSocket对象和系统要指定的端口号
        2.使用ServerSocket对象中的方法accept，获取到请求的客户端对象Socket
        3.使用Socket对象中的方法getInputStream()获取网络字节输入流InputStream对象
        4.使用网络字节输入流InputStream对象中的方法read，读取客户端发送的数据
        5.使用Socket对象中的方法getOutputStream()获取网络字节输出流OutputStream对象
        6.使用网络字节输出流OutputStream对象中的方法write，给客户端回写数据
        7.释放资源(Socket,ServerSocket)
 */
public class Server {
    public static void main(String[] args) throws IOException {
        System.out.println("启动服务端成功!");

        //1.创建服务器ServerSocket对象和系统要指定的端口也就是为服务端注册端口号,在注册好端口号后,只需要实现监听即可,一个服务端可以处理多个客户端之间的消息
        ServerSocket serverSocket = new ServerSocket(8888);
        //2.使用ServerSocket对象,调用一个accept()接收的方法, 等待客户端的连接请求
        Socket socket = serverSocket.accept();//程序会在这里暂停,直到等待客户端连接,返回一个Socket对象,代表客户端的连接,并接收到客户端的消息
        //3.使用Socket对象(通信管道)中的方法getInputStream()获取网络字节输入流InputStream对象
        InputStream inputStream = socket.getInputStream();
        //由于客户端和服务端间的收发数据比较严格,所以需要保证服务端和客户端使用同一种数据流进行数据的处理,客户端使用的是数据输出流,所以在服务端(接收端)需要使用对等的数据输入流
        //4.把原始的字节输入流包装成数据输入流使用网络字节输入流InputStream对象中的方法read，读取客户端发送的数据--可以换掉
        DataInputStream dataInputStream = new DataInputStream(inputStream);
        //5.使用数据输入流DataInputStream对象中的方法readUTF()读取客户端发送的数据
        String s = dataInputStream.readUTF();//由于客户端发数据使用的是writeUTF的方法进行数据到流的写入,所以在读出的时候也只能使用readUTF的方法进行对应的读出
        System.out.println("接收到的消息为 "+s);

        //获取远程的客户端连接的IP地址
        System.out.println(socket.getRemoteSocketAddress());
        dataInputStream.close();
        serverSocket.close();//关闭数据输入流和服务端的通信管道
    }
}
