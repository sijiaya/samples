package com.soft1841.week3;

import java.util.Scanner;

public class ScoreDegreeSwitch {
    public static void main(String[] args) {
        System.out.println("请输入您的成绩");
        Scanner scanner = new Scanner(System.in);
        int score = scanner.nextInt();
        if (score >= 0 && score <= 100){
            int quotient = score / 10;
            //使用switch判断
            switch (quotient){
                case 10:
                case 9:
                    System.out.println("等级为优秀");
                    //结束判断
                    break;
                case 8:
                    System.out.println("等级为良好");
                    break;
                case 7:
                    System.out.println("等级为中等");
                    break;
                case 6:
                    System.out.println("等级为及格");
                    break;
                case 5:
                case 4:
                case 3:
                case 2:
                case 1:
                case 0:
                    System.out.println("等级为不及格");
                    break;
        }
    }else{
            System.out.println("成绩范围非法");
        }
        scanner.close();
    }
}
