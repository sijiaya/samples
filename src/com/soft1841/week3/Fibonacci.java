package com.soft1841.week3;

import java.util.Scanner;

/**
 * 输出斐波那契数列前10项并初始化
 * @author 思佳
 */
public class Fibonacci {
    public static void main(String[] args) {
        int n;
        System.out.println("斐波那契的前n项：");
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        //定义前两项并初始化
        int one = 0;
        int two = 1;
        System.out.println("输出");
        System.out.print( one + "  " + two);
        //定义第三项，无需初始化
        int three;
        //定义一个for循环变量
        int i;
        //写出for循环结构
        for (i = 2; i <= n; i ++){
            //计算出第三项
            three = one + two;
            System.out.print("  " + three);
            //挪动下标one,two
            one = two;
            two = three;
        }
    }
}

