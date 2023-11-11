package com.itheima.udp1;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;
/*
    实现一个服务端的数据传输
 */
public class Server {
    public static void main(String[] args) throws IOException {
        //创建一个服务端对象,服务端对象,不在意有多少的客户端连接,只要有客户端发送数据过来,就会接收到数据,但是需要都指定服务端的ip和端口
        DatagramSocket datagramSocket = new DatagramSocket(666);//注意在服务端中接收数据可以只设置一个端口,那么在开启多个不同端口的客户端运行后依旧是可以使用固定的一个服务端接收到客户端发来的数据的
        //创建一个字节数组用来接收数据,再创建一个数据包对象封装字节数组
        byte[] bytes = new byte[1024*64];//因为一个数据包中的数据不会超过64kb,所以这里设置一个64kb的字节数组,防止由于数组过小无法完整存储数据
        DatagramPacket datagramPacket = new DatagramPacket(bytes, bytes.length);//第一个参数是要存储的字节数组,第二个参数是要存储的数据的长度这里直接使用字节数组的长度来代替
        System.out.println("服务端启动");
        while (true) {
            //开始正式使用数据包来接收客户端发来的数据
            datagramSocket.receive(datagramPacket);//这里的receive方法是一个阻塞方法,会一直等待客户端发来的数据,直到接收到数据为止,将接收到的数据存储到数据包的字节数组中
            //从字节数组中获取数据,并将数据打印
            System.out.println(new String(datagramPacket.getData(), 0, datagramPacket.getLength()));//这里的getLength方法是获取数据包中的数据的长度,这里的数据长度是指的是数据包中的数据的长度,而不是字节数组的长度
            System.out.println(datagramPacket.getAddress().getHostAddress());//获取数据包中的客户端ip地址
            System.out.println(datagramPacket.getPort());//获取数据包中的客户端端口号
            //服务端不关闭,一直等待客户端发来的数据,所以不需要使用datagramSocket.close()方法来关闭服务端
        }
    }
}
