package com.itheima.buffer_stream;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class BufferWriterTest {
    public static void main(String[] args) {
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("day_11_6/src/meiren"))) {
            bufferedWriter.write(97);
            bufferedWriter.write('b');
            bufferedWriter.write("美");
            bufferedWriter.write("\r\n");
            bufferedWriter.write("就喜欢大美人");
            bufferedWriter.newLine();//这里的作用和直接将"\r\n"的回车换行写在代码中的作用是一样的,都能实现代码的回车换行
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
