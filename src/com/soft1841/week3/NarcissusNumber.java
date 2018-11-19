package com.soft1841.week3;

/**
 * 1000以内的水仙花数
 * @ author 思佳
 */

import java.util.Scanner;

public class NarcissusNumber {
    public static void main(String[] args) {
        //定义初始量
        int i = 100;
        //水仙花数为100--999的三位数
        while (i < 999){
            //循环变量自加
            i ++;
            //获取百位数字
            int hundreds = i /100;
            //获取十位数字
            int ten = i % 100 / 10;
            //获取个位数字
            int digit = i % 10;
            if ( i == hundreds * hundreds * hundreds + ten * ten * ten + digit * digit * digit){
                System.out.println("水仙花数为" + i);
            }
        }
    }
}
