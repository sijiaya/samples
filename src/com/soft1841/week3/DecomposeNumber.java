package com.soft1841.week3;

import java.util.Scanner;

public class DecomposeNumber {
    public static void main(String[] args) {
        System.out.println("请输入一个正整数：");
        Scanner scanner = new Scanner(System.in);
        //定义输入值
        int number;
        number = scanner.nextInt();
        System.out.println(number + "=");
        //定义一个for循环变量
        int i;
        //写出for循环结构
        for (i = 2;i <= number;i ++){
            while (number > i){
                if (number%i == 0){
                    System.out.print(i + "*");
                    //把number重新定义
                    number = number/i;
                }else
                    break;
            }
        }
        System.out.println(number);
    }
}
