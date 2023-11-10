package com.itheima.data_stream;

import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.FileOutputStream;

/*
    目标: 掌握数据输出流的使用
 */
public class DataOutputStreamTest {
    public static void main(String[] args) {
        //创建一个数据输出流包装低级的字节输出流
        try (
                DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream("day_11_6/src/wangdao999.txt"))
        ) {
            //写出数据
            dataOutputStream.write(97);
            dataOutputStream.writeBoolean(true);
            dataOutputStream.writeDouble(99.99);
            dataOutputStream.writeUTF("我爱大美人");
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
