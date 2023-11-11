package com.itheima.tcp;

import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

/*
    TCP通信的客户端：向服务器发送连接请求，给服务器发送数据，读取服务器回写的数据
    表示客户端的类：
        java.net.Socket：此类实现客户端套接字（也可以就叫“套接字”）。套接字是两台机器间通信的端点。
        套接字：包含了IP地址和端口号的网络单位

 */
public class Client {
    public static void main(String[] args) throws IOException {
        //创建Socket对象, 并同时请求与服务端程序的连接
        Socket socket = new Socket("127.0.0.1", 8888);
        //从Socket通信管道中得到一个字节输出流,用来发数据给服务端程序
        OutputStream outputStream = socket.getOutputStream();
        //通过字节输出流写数据给服务端
//        outputStream.write();
        //把低级的字节输出流包装成数据输出流,在通过数据输出流直接写数据到服务端
        DataOutputStream dataOutputStream = new DataOutputStream(outputStream);
        dataOutputStream.writeUTF("你好, 服务端, 我是客户端");
        dataOutputStream.close();//在数据传输完毕后, 关闭数据输出流(否则无法再次进行输出数据),并且需要关闭通信管道
        socket.close();//果不关闭它，那么它持有的资源（比如，底层的OutputStream对象）就无法被释放，这将持续占用系统资源。当程序尝试再次使用这个 DataOutputStream 时，可能会出现各种不可预期的错误。
        //另外，不关闭 Socket 对象会导致网卡资源和端口的占用
    }
}
