package com.soft1841.week3;

public class StudentNo {
    public static void main(String[] args) throws InterruptedException {
        //循环变量初始化
        int id = 1;
        //循环条件，输出学号1到40的学生
        while (id <= 40) {
            //处理学号尾数在10以内的情况
            if ( id >= 1 && id <10){
                System.out.println("软件1841学生学号为180234330" + id);
                //线程休眠1秒
                Thread.sleep(1000);
                //循环变量自增
                id ++;
            }else {
                //处理学号尾数在10以上的学号
                System.out.println("软件1841学生学号为18023433" + id);
                Thread.sleep(1000);
                id ++;
            }
        }
        System.out.println("输出完毕");
    }
}
