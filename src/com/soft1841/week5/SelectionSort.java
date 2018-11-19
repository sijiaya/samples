package com.soft1841.week5;

import java.util.Random;

public class SelectionSort {
    public static void main(String[] args) {
        //创建一个指定长度的一维数组
        final int N = 5;
        int[] a = new int[N];
        //创建一个随机数种子
        Random random = new Random();
        for (int i = 0; i < N; i++) {
            a[i] = random.nextInt(100);
        }
        //显示排序前的数组
        System.out.println("排序前:");
        for (int n : a) {
            System.out.print(n + "  ");
        }
        //进入循环比较大小，并进行交换
        int min;
        int temp;
        for (int i = 0; i < N - 1; i++) {
            //将当前下标定义成最小值下标
            min = i;
            for (int j = i + 1; j < N; j++) {
                //如果有小于当前最小值的关键字
                if (a[j] < a[min]) {
                    //将该最小关键字下标赋值给min
                    min = j;
                }
            }
            //若min不等于i，则找到最小值，交换
            if (i  != min){
                temp = a[i];
                a[i] = a[min];
                a[min] = temp;
            }
            }
        }
    }