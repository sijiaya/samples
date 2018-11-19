package com.soft1841.week3;

import java.util.Scanner;

public class AddNumber {
    public static void main(String[] args) {
        //定义一个输入值
        int a;
        System.out.println("请输入一个数：");
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextInt();
        int s = 0;
        int t = 0;
        int i;
        for ( i = 1;i <= a;i ++){
            t = t * 10 + a;
            s = s + t;
            System.out.print(t + "  ");
        }
        System.out.println("s" + "=" + s);
    }
}


