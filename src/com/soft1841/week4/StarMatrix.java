package com.soft1841.week4;

/**
 * 下三角
 */

public class StarMatrix {
    public static void main(String[] args) {
        final int COUNT = 3;
        //行
        int i;
        //列
        int j;
        for (i = 0; i < COUNT; i ++){
            for (j = 0; j < i + 1; j ++){
                System.out.print("*" + "  ");
            }
            System.out.println();
        }
    }
}
