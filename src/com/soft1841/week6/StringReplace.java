package com.soft1841.week6;

/**
 * 替换错别字
 */

public class StringReplace {
    public static void main(String[] args) {
        //创建字符串
        String str = "登陆时注意事项，完成后点击“登陆”按钮即可完成登陆";
        //将错别字和正确字输入
        String restr = str.replace("陆","录");
        //输出原字符串
        System.out.println("更改前：" + str);
        //输出更改后字符串
        System.out.println("更改后：" + restr);
    }
}
