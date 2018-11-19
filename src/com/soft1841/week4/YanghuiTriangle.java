package com.soft1841.week4;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

public class YanghuiTriangle {
    public static void main(String[] args) throws FileNotFoundException {
        PrintStream out1 = System.out;
        PrintStream out2 = new PrintStream("YanghuiTriangle.txt");
        Scanner scanner = new Scanner(System.in);
        int sum = 1;
        System.out.println("请输入一个数字");
        int count = scanner.nextInt();
        int i;
        for (i = 1; i<= count; i++) {
            for (int j = count; j>=i; j--){
                System.setOut(out1);
                System.out.print("");
                System.setOut(out2);
                System.out.print("");
            }
            for (int j =1; j<=i;j++){
                if (j>1){
                    sum = sum*(i-j+1)/(j-1);
                    System.setOut(out1);
                    System.out.print(" "+sum + "");
                    System.setOut(out2);
                    System.out.print(" "+sum + "");
                }else{
                    System.setOut(out1);
                    System.out.print("1");
                    System.setOut(out2);
                    System.out.print("1");
                }
            }
            System.setOut(out1);
            System.out.println();
            System.setOut(out2);
            System.out.println();
        }
    }
}