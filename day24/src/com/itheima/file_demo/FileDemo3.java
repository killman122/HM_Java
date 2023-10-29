package com.itheima.file_demo;

import java.io.File;

/*
    | **方法名**               | **说明**                           |
| ------------------------ | ---------------------------------- |
| public  boolean delete() | 删除由此抽象路径名表示的文件或目录 |

删除目录时的注意事项：

- delete方法直接删除不走回收站。

- 如果删除的是一个文件，直接删除。

- 如果删除的是一个文件夹，需要先删除文件夹中的内容，最后才能删除文件夹,意味着必须是一个空文件夹否则无法删除

### **File**类判断和获取功能
 */
public class FileDemo3 {
    public static void main(String[] args) {
        boolean delete = new File("day24/src/com/itheima/file_demo/d/b/c").delete();//使用相对路径删除,但是使用的linux中的常用路径分隔符正斜杠'/'
        System.out.println(delete);
        System.out.println(new File("day24\\src\\com/itheima/file_demo/d").delete());//使用相对路径删除,并使用windows下的路径分隔符反斜杠'\'和linux中的路径分隔符正斜杠,但是反斜杠需要转义,所以使"\\"
        System.out.println(new File("day24\\src\\com\\itheima\\file_demo\\b\\e\\f").delete());//使用相对路径删除,并使用windows下的路径分隔符反斜杠'\',但是注意需要使用转义

        //使用绝对路径删除
        System.out.println(new File("D:\\IdeaProject\\HM_Java\\day24\\src\\com\\itheima\\file_demo\\b\\e").delete());
    }
}
