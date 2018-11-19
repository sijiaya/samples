package com.soft1841.week3;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        //定义要输入的数
        int input;
        System.out.println("请输入一个正整数：");
        Scanner scanner = new Scanner(System.in);
        //定义output的初始值
        int output = 1;
        input = scanner.nextInt();
        //循环，若数大于1则为正整数
        while (input > 0){
            output =output * input;
            input--;
        }
        //输出结果7
        System.out.println("该正整数的阶乘为：" + output);

    }
}
