package com.heima._02随机数;
import java.util.Random;
/*
  Random类   用来生成随机数
  导包    import java.util.Random;
         如果是扫描器输入就是 import java.util.Scanner;

  创建对象  Random r = new Random();
  生成随机数   int num = r.nextInt(10);  生成int取值范围随机
  生成随机数   double num = r.nextDouble();  生成double取值范围随机
  生成随机数   boolean num = r.nextBoolean();  生成boolean取值范围随机
  生成随机数   float num = r.nextFloat();  生成float取值范围随机

  int bound
  指定范围生成随机数   int num = r.nextInt(bound);  生成int取值范围在0-bound之间的随机数  包含0,不包含bound  bound必须为int类型的整数

  生成区间的随机数:[最小值,最大值]
    int num = random.nextInt(最大值+1-最小值)+最小值   要保持(括号内)和括号外之间的数据一直,不存在差值     最大值加1表示的是要取的数,因为random中的nextInt()方法无法取出数据中的右边界,因为取值区间左闭右开
 */
public class Demo1随机数入门 {
    public static void main(String[] args) {
        Random r = new Random();
//        int i = r.nextInt();
//        int i = r.nextInt(10);
//        System.out.println(i);
//        while (true){
//            int i = r.nextInt(10);
//            System.out.println(i);
//        }
//        int num = r.nextInt(-10);
//        System.out.println(num);//非法参数异常IllegalArgumentException    Illegal非法的 Argument参数 Exception异常 positive正数

//        思考:由于该函数无法向python中的元组传递两个至多个参数,所以无法实现python中的random.randint(0,10)的功能
//        那么如何实现某一段范围中取值,比如生成20-90之间的随机数
//        0-90之间的随机数是直接将91之间的整数随机选取一个,然后再加上20即可变为20-110之间的随机数,但是可以通过降低bound的值来实现多加的这段数进行放缩
        int i = r.nextInt(90)+20;//这里得到是0-89的随机数但是又加上了基数20,所以得到的是20-109之间的随机数
//      但是由于计数从0开始+20,所以多加了20,要从参数bound中减去,实现指定范围中选取随机数

//        生成33--99之间的随机数,首先生成0-99之间的随机数,由于需要从33开始所以总体加上33,在从得到的随机数的边界值bound中减少33
//        while (true) {
//            int i1 = r.nextInt(100-33)+33;
//            System.out.println(i1);
//        }

//        生成-10~10之间的随机数
        while (true) {
            int i1 = r.nextInt(10+1+10)-10;
            System.out.println(i1);
        }
    }

}
