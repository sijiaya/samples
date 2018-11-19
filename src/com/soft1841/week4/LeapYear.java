package com.soft1841.week4;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        //定义输入流
        Scanner scan = new Scanner(System.in);
        //给出输入提示
        System.out.println("please input:");
        long year = scan.nextLong();
        //判断是否为闰年
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0){
            //输出结果
            System.out.println("yes");
        }else{
            System.out.println("no");
        }
    }
}
