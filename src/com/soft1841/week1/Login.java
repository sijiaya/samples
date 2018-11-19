package com.soft1841.week1;

import java.util.Scanner;

/**
 * 登录程序
 */
public class Login {
    public static void main(String[] args) {
        //定义账号变量
        String account;
        //定义密码变量
        String password;
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入账号：");
        account = scanner.nextLine();
        System.out.println("请输入密码：");
        password = scanner.nextLine();
        //验证登录是否正确
        if ("softysj".equals(account) && "Soft_1841".equals(password)){
            System.out.println("账号密码正确，登录成功");
        }else {
            System.out.println("登录失败");
        }
    }
}

