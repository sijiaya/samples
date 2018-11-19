package com.soft1841.week6;

/**
 * 字符串相关程序
 */
public class StringDemo {
    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = "hello";
        String s3 = new String("niit");
        String s4 = new String("niit");
        String s5 = new String("Niit");
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
        System.out.println(s3 == s4);
        System.out.println(s3.equals(s4));
        System.out.println(s3.equals(s5));
        System.out.println(s3.equalsIgnoreCase(s5));


        String phoneNumber = "18801582811";
        String hiddenNumber = phoneNumber.replaceAll("(\\d{3})\\d{4}(\\d{4})",
                "$1****$2");
        System.out.println(hiddenNumber);

        String idCardNumber = "332526200007195142";
        String subString = idCardNumber.substring(6,10);
        System.out.println(subString + "年");

        String schoolName = "南京工业职业技术学院";
        System.out.println(schoolName.contains("南京"));
    }
}
