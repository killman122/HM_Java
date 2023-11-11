package com.itheima.udp1;

import java.io.IOException;
import java.net.*;
import java.util.Scanner;

/*
    目标: 实现UDP的发送端,完成一个发送一个接收
 */
public class Client {// 这里是一个客户端
    public static void main(String[] args) throws IOException {
        //创建客户端对象,这里使用无参构造器不指定端口,由系统随机分配端口号,如果指定端口号,则需要在DatagramSocket()构造器传入参数中指定端口号
        DatagramSocket datagramSocket = new DatagramSocket();
        //创建数据包对象封装要发出去的数据,接收端的ip地址和端口号
        Scanner scanner = new Scanner(System.in);//创建一个扫描器对象
        exit:while (true) {//通过死循环的方式,循环发送封装后的数据包,和python中的Socket的方式发送数据包相仿
            //使用二进制数组保存需要发送的数据,在通过数据包的封装,再将要发送的消息封装到数据包中
            System.out.println("请输入要发送的消息");
            String s = scanner.nextLine();

            //当用户输入的是exit命令就退出客户端
            if (s.contentEquals("exit")){//s.equals("exit")是一个判断是否是exit的方法,如果是exit就退出客户端
                System.out.println("客户端即将退出");
                datagramSocket.close();//释放网卡资源
                break exit;
            }
            byte[] bytes1 = s.getBytes();
//            byte[] bytes = "我是一个客户端间的通信信息".getBytes();//将字符串转换成字节数组
            DatagramPacket datagramPacket = new DatagramPacket(bytes1, 0, bytes1.length, InetAddress.getLocalHost(), 666);//参数一buffer封装要发送出去的数据(和数据的流式存储一样,都是使用byte字节类型数据存储),参数二是开始的消息的索引值,参数三length数据长度(发送出去的数据大小字节个数),参数四服务端的ip地址(找到服务端主机),参数五服务端程序端口号(此处为客户端代码不是服务端)
            //发送数据包,通过socket对象发送数据包
            datagramSocket.send(datagramPacket);
        }
//        System.out.println("客户端数据发送完毕, 即将关闭通信");
        //最后在消息发送完成后关闭通信, 防止持续占用网卡数据影响性能
//        datagramSocket.close();
    }
}

