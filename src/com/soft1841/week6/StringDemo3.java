package com.soft1841.week6;

/**
 * 禁词过滤,将指定字符替换成新字符
 */

public class StringDemo3 {
    public static void main(String[] args) {
        String content = "床前明月光，疑是地上霜。" +
                "举头望明月，低头思故乡。";
        //字符串的替换
        String finalStr = content.replaceAll("明月","**");
        System.out.println(finalStr);
    }
}
