package com.soft1841.week4;

import java.util.Scanner;

public class IsoscelesTriangle {
    public static void main(String[] args) {
        System.out.println("请输入一个数：");
        Scanner scanner = new Scanner(System.in);
        int rows;
        rows = scanner.nextInt();
        for (int i = 0;i < rows; i ++){
            for (int j = rows; j > i; j --){
                System.out.print(" ");
            }
            for (int j = 0;j <= i;j ++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
