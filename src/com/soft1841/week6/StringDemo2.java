package com.soft1841.week6;

/**
 * 文件类型识别
 */
public class StringDemo2 {
    public static void main(String[] args) {
        String[] fileNames = {"1.jpg","2.png","3.pdf","4.png","5.bmp","6.doc"};
        //图片文档初始化为0
        int imgCount = 0;
        int docCount = 0;
        for (String fileName:fileNames) {
            if (fileName.endsWith(".jpg")||fileName.endsWith(".png")||fileName.endsWith(".bmp")){
                //统计文档数量
                imgCount++;
            }
            if (fileName.endsWith(".pdf")||fileName.endsWith(".exe")||fileName.endsWith(".doc")){
                docCount++;
            }
        }
        System.out.println("图片" + imgCount + "张，文档" + docCount + "个");
    }
}
