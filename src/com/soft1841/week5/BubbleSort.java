package com.soft1841.week5;

import java.util.Random;

public class BubbleSort {
    public static void main(String[] args) {
        //创建一个指定长度的一维数组
        final int N = 5;
        int[] numbers = new int[N];
        //创建一个随机数种子
        Random random = new Random();
        for (int i =0;i<N;i++){
            numbers[i] = random.nextInt(100);
        }
        //显示排序前的数组
        System.out.println("排序前:");
            for (int n:numbers) {
                System.out.print(n + "  ");
            }
            //进入循环比较大小，并进行交换
        int t;
        for (int i = 0;i < N-1;i++){
            for (int j = i + 1;j< N;j++){
                if (numbers[i] > numbers[j]){
                    t = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = t;
                }
            }
        }
        //显示排序后 的数组
        System.out.println("\n排序后:");
        for (int n:numbers
             ) {
            System.out.print(n + "  ");
        }
    }
}