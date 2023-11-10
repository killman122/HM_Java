package com.itheima.dom;

import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import javax.xml.transform.sax.SAXResult;
import java.util.List;

/*
    通过Dom4j框架解析XML
 */
public class Dom4jTest {
    public static void main(String[] args) throws DocumentException {
        //创建一个Dom4j框架提供的一个解析器对象,解析器的名字叫做,SAXReader()
        SAXReader saxReader = new SAXReader();
        //使用saxReader对象把需要解析的XML文件读成一个Document对象, 这里传入的参数是一个直接的文件路径,读出后返回的是一个document的文档对象
        Document document = saxReader.read("day_11_6/src/com/itheima/dom/hello_world.xml");
        //从文档对象中解析XML文件的全部数据
        Element rootElement = document.getRootElement();//拿到根元素对象,这里的方法和python中bs4的解析方法有点相似selenium
        String name = rootElement.getName();
        System.out.println(name);
        //获取根元素下的全部一级子元素
        List<Element> elements = rootElement.elements();//使用elements()方法直接调用拿到的是所有的子元素标签,但是如果在括号内填写参数后,拿到的是指定的单个子元素的标签,如果这个标签没有使用
        for (Element element : elements) {
            System.out.println(element.getName());
        }
        //获取当前元素下的某个子元素对象, 通过根元素进行由外向内的递归查询
        Element user = rootElement.element("user");//如果下面有多个子元素,默认获取第一个子元素在调用element()方法的时候,在没有多个元素的情况下,如果制定了选取的元素色名字那么选出的元素就是是实际上作用的元素
        System.out.println(user.getText());//获取到第一个子元素的名称,不是两个标签之间夹着的内容
        String s = user.elementText("name");
        System.out.println(s);

        //如何获取元素中的属性的信息
        System.out.println(user.attributeValue("id"));//注意这里获取的是属性的值不是标签的名字
        Attribute name1 = user.attribute("id");
        System.out.println(name1.getName());
        System.out.println(name1.getValue());

        List<Attribute> attributes = user.attributes();
        for (Attribute attribute : attributes) {
            System.out.println("属性的名字是" + attribute.getName() + "=" + attribute.getValue());
        }

        //如何获取全部的文本内容: 获取当前元素下的子元素的文本值
        String s1 = user.elementText("name");
        Element data = user.element("data");
        System.out.println(data.getText());
        //如何取出文本并删除取出的文本之间的空格
        String s2 = data.getTextTrim();
        System.out.println(s2);
    }
}
