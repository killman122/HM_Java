package com.itheima.printstream;

import java.io.FileOutputStream;
import java.io.PrintStream;
import java.nio.charset.Charset;

/*
    目标: 掌握打印流: PrintStream/PrintWriter 的用法
 */
public class PrintTest {
    public static void main(String[] args) {
        //创建一个打印流管道,使用打印流管道中的方法也可以实现自动换行
        try (
                PrintStream printStream = new PrintStream("day_11_6/src/wangdao777.txt", Charset.forName("UTF-8"));
//                PrintStream printStream = new PrintStream("day_11_6/src/wangdao777.txt", "GBK");//可以直接传入编码类型为第二个参数,也可以使用Charset中的forName()方法传入编码类型
//                PrintStream printStream = new PrintStream("day_11_6/src/wangdao777.txt");
                //对于高级流管道PrintStream是无法在输出数据到文件中的时候实现追加数据的,但是可以在高级流中嵌套低级流实现
                PrintStream printStream1 = new PrintStream(new FileOutputStream("day_11_6/src/wangdao777.txt",true));
        ) {//因为对于这些特殊的流,都需要使用特殊的方法,所以这里不需要使用多态的方式引入对象
            printStream.print(97);
            printStream.println('a');
            printStream.println("我爱大美人");
            printStream.println(true);
            printStream.println(99.99);
            printStream.write(97);//将byte类型的二进制数据编码转换为ascii表中对应的String类型字符串
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
