package com.itheima.ip;

import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;

/*
    目标: 掌握InetAddress类的使用
 */
public class InterAddressTest {
    public static void main(String[] args) throws IOException {
        //在InetAddress类中有一个静态方法getLocalHost()可以获取本机的IP地址对象
        //static InetAddress getLocalHost()
        InetAddress localHost = InetAddress.getLocalHost();
        //InetAddress类中还有一个方法getHostName()可以获取主机名
        String hostName = localHost.getHostName();
        System.out.println(hostName);
        //InetAddress类中还有一个方法getHostAddress()可以获取主机的IP地址
        String hostAddress = localHost.getHostAddress();
        System.out.println(hostAddress);
        boolean reachable = localHost.isReachable(5);
        System.out.println(reachable);

        //获取指定IP或者域名的IP地址对象
        InetAddress byName = InetAddress.getByName("www.github.com");
        System.out.println(byName.getHostName());
        System.out.println(byName.getHostAddress());
        //使用isReachable()方法可以判断当前主机是否可以连接指定的IP地址,相当于直接在控制台中使用ping命令
        System.out.println(byName.isReachable(5000));
    }
}
