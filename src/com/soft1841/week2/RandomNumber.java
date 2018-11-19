package com.soft1841.week2;

import java.util.Random;

/**
 * 随机数小程序
 * @author 思佳
 * 2018.10.17
 */
public class RandomNumber {
    public static void main(String[] args) {
        //定义三个整型变量，分别是百位，十位，个位
        int hundred;
        int ten;
        int digit;
        //定义一个整型变量，用来表示三位数
        int number;
        //定义一个随机数种子
        Random random = new Random();
        //随机产生【0，n)之间的正整数
        hundred = random.nextInt(10);
        ten = random.nextInt(10);
        digit = random.nextInt(10);
        System.out.println("百位是：" + hundred + ",十位数" + ten + ",个位是" + digit);
        //根据百、十、个位的数字计算出相应的三位数
        number = hundred * 100 + ten * 10 *digit;
        System.out.println("结果是：" + number);
    }
}
