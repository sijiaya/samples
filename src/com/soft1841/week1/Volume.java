package com.soft1841.week1;

import java.util.Scanner;

public class Volume {
    public static void main(String[] args) {
        //定义半径变量
        int radius;
        //定义高度变量
        int height;
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入粮仓半径：");
        radius = scanner.nextInt();
        System.out.println("请输入粮仓的高度：");
        height = scanner.nextInt();
        //定义PI
        final double PI = 3.1415926;
        double volume = PI * radius * radius * height;
        double kilo = 750 * volume;
        System.out.println("您的粮仓体积为：" + volume + "平方米");
        System.out.println("您的粮仓能存储的粮食为：" + kilo + "千克");
    }
}
