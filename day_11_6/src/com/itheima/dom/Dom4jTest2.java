package com.itheima.dom;

import java.io.BufferedWriter;
import java.io.FileWriter;

/*
    目标: 使用程序将数据写出到XML文件中
    <?xml version="1.0" encoding="UTF-8" ? >
    <book>
        <name>疯狂Java讲义</name>
        <author>周志明</author>
        <price>88.88</price>
    </book>
 */
public class Dom4jTest2 {
    public static void main(String[] args) {
        //使用一个StringBuilder对象来构造xml文件内容，然后将其写入到文件中
        StringBuilder sb = new StringBuilder();//如果不使用换行符,那么会将所有的数据追加到一行
        sb.append("<?xml version=\"1.0\" encoding=\"UTF-8\" ?>\r\n");
        sb.append("<book>\r\n");
        sb.append("\t<name>疯狂Java讲义</name>\r\n");//这里的\t是制表符
        sb.append("\t<author>周志明</author>\r\n");
        sb.append("\t<price>88.88</price>\r\n");
        sb.append("</book>");
        try (//将管道写在try-with-resource中可以实现管道的自动关闭
                BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("day_11_6/src/com/itheima/dom/book.xml"))
        ) {
            bufferedWriter.write(sb.toString());
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
