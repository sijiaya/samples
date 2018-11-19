package com.soft1841.week6;

/**
 * 验证密码
 */

public class StringDemo4 {
     public static void main(String[] args) {
        //输入一个密码
        String password = "Yj097386";
        //给密码指定范围
        String regexp = "[0-9A-Za-z]{6,12}";
        //进行验证
        boolean flag = password.matches(regexp);
        System.out.println(flag);
     }
  }
