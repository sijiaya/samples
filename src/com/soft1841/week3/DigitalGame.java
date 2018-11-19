package com.soft1841.week3;

import java.util.Scanner;

public class DigitalGame {
    public static void main(String[] args) {
        //定义目标数字
        int answer = 76;
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入您的猜测：");
        //输入猜测数字
        int guess;
        guess = scanner.nextInt();
        //判断猜测数字是否等于目标数字
        if (guess == answer){
            System.out.println("你猜对了！");
        }
        //判断猜测数字与目标数字不等的情况
        while (guess != answer){
            if (guess < answer){
                System.out.println("您输的太小了，请重新输入！");
                guess = scanner.nextInt();
            }else{
                System.out.println("您输的太大了，请重新输入！");
                guess = scanner.nextInt();
            }
            if (guess == answer){
                System.out.println("你猜对了！");
            }
        }
    }
}
