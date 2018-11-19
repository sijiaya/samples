package com.soft1841.week4;
/**
 * 求极值和最值和
 * @author 思佳
 */

import java.util.Scanner;

public class MinNumber {
    public static void main(String[] args) {
        final int COUNT = 5;
        Scanner scanner = new Scanner(System.in);
        int i;
        int number;
        int sum = 0;
        int min = 3;
        int max = 11;
        for (i = 0; i <= COUNT; i ++){
            System.out.println("please input a number:");
            number = scanner.nextInt();
            if (number < min ){
                min = number;
            }
            if (number > max){
                max = number;
            }
              sum = min + max;
        }
        System.out.println("i=" + i + ",min=" + min + ",max=" + max + ",sum =" + sum);
    }
}
