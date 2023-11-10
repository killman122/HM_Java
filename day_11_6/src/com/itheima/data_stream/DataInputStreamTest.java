package com.itheima.data_stream;
import java.io.DataInputStream;
import java.io.FileInputStream;

/*
    目标: 使用数据输入流读取特定类型的数据
 */
public class DataInputStreamTest {
    public static void main(String[] args) {
        try (//将创建各种流的代码写在try-with-resource中的()中,为了自动释放资源,读取的数据需要和写出的数据类型一致并且读写的方法和顺序都一致,也就是说使用什么类型的变量写输入,就需要以什么类型的变量读出来
                DataInputStream dataInputStream = new DataInputStream(new FileInputStream("day_11_6/src/wangdao999.txt"))
        ) {
            //读取数据
            int a = dataInputStream.readByte();
            boolean b = dataInputStream.readBoolean();
            double c = dataInputStream.readDouble();
            String d = dataInputStream.readUTF();
            System.out.println(a);
            System.out.println(b);
            System.out.println(c);
            System.out.println(d);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
