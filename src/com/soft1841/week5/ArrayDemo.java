package com.soft1841.week5;

import java.util.Random;

public class ArrayDemo {

    public static void main(String[] args) {
        //创建一个指定长度的一维数组
        int[] a = new int[10];
        //创建一个随机数种子
        Random random = new Random();
        //循环产生整数，开始值给一维数组，输出
        for (int i = 0;i <a.length;i ++){
            a[i] = random.nextInt(100);
            System.out.print(a[i] + "  ");
        }
        //求数组里的最大值

    }
}
