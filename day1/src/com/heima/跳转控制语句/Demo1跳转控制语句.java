package com.heima.跳转控制语句;

/*
    流程跳转控制语句
    continue: 跳过本次  继续下一次
    break: 在循环中 用来结束循环
 */
public class Demo1跳转控制语句 {
    public static void main(String[] args) {
        for (int i = 0; i <= 5; i++) {
            if (i==2){
                continue;//当i为2时不打印输出,但是当i为其他的数时,都需要实现打印输出
            }
            System.out.println(i);
        }
        System.out.println("---------------------");
        for (int i = 0; i <= 5; i++) {
            if(i==2){
                break;
            }
            System.out.println(i);//当i为2时,结束所有的循环
        }
        System.out.println("---------------------");
        //双层嵌套循环结束当前循环或者说是离break和continue跳转控制语句最近的
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (j==2){
                    break;
                }
                System.out.println("i= "+i+"; j="+j);
            }
        }
        System.out.println("---------------------");
        //嵌套循环想结束外层的循环,可以为循环起别名(创建标号|标识),当然也可以在外层循环中做(不对,在外层循环中做的处理和直接在内层循环中的不一样)
        wc:for (int i = 0; i < 5; i++) {
            nc:for (int j = 0; j < 5; j++) {
                if (j==2){
                    break wc;
                }
                System.out.println("i= "+i+"; j="+j);
            }
        }
    }
}
