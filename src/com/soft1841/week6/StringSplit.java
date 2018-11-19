package com.soft1841.week6;

/**
 * 分割单词
 */

public class StringSplit {
    public static void main(String[] args) {
      String str = "I love Java";
      //regex:  regular expression正则表达式
      String[] letters = str.split(" ");
        for (String letter:letters) {
            System.out.println(letter);
        }
    }
}
