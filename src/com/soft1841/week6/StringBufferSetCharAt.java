package com.soft1841.week6;

public class StringBufferSetCharAt {
    public static void main(String[] args) {
        //创建StringBuffer对象，记录电话号
        StringBuffer phoneNum = new StringBuffer("18801582811");
        //从3开始循环到6
        for(int i = 3; i <= 6; i++){
            phoneNum.setCharAt(i,'*');
        }
        System.out.println( "手机号为"+phoneNum);
    }
}
