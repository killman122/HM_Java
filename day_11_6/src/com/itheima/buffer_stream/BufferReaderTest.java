package com.itheima.buffer_stream;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;

public class BufferReaderTest {
    public static void main(String[] args) {
        try(
                BufferedReader br = new BufferedReader(new FileReader("day_11_6/src/wangsansi"));
        ){
          /*  char [] buffer = new char[3];
            int len;
            while ((len = br.read(buffer))!=-1){
                System.out.println(new String(buffer,0,len));//将长度为实际的read的长度的数据进行输出,而不是将如果存在空余的3字节外的数据空间,读取空数据进行填充
            }*/
            //读取文件一行数据,当读取到文件的末尾时返回null
//            System.out.println(br.readLine());
//            System.out.println(br.readLine());
//            System.out.println(br.readLine());
            String line;//记录每次读取的一行数据
            while ((line = br.readLine())!=null){//因为只有在读取到最后一行的数据时,读取到文件的末尾则返回一个null,否则打印读取到的每一行的数据
                System.out.println(line);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
