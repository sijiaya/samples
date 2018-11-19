package com.soft1841.week2;

import java.util.Random;

public class Distance {
    public static void main(String[] args) {
        //定义整型变量
        int x1;
        int x2;
        int y1;
        int y2;
        //定义一个随机数
        Random random = new Random();
        //随机产生【0，n)之间的正整数
        x1 = random.nextInt(600);
        x2 = random.nextInt(600);
        y1 = random.nextInt(600);
        y2 = random.nextInt(600);
        //求出两点间距离
        double result = Math.sqrt((x1-x2) * (x1-x2)+ (y1-y2) * (y1 -y2));
        //输出结果
        System.out.println("点" + "(" + x1 + "," + y1 + ")"  + "到点" + "(" + x2 + ","  + y2 + ")" + "的距离为：" + result);
    }
}
