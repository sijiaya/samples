package com.soft1841.week3;

import java.time.LocalDateTime;
import java.time.LocalTime;

/**
 * 和系统同步时间，到秒级
 *
 * @author 思佳
 * 2018.10.24
 */

public class SystemTime {
    public static void main(String[] args) throws InterruptedException {
        //如何通过time的API指定一个结束时间
        LocalTime endTime = LocalTime.of(8,40,43);
        while (true){
            //使用JDK8的时间API，获取当前系统时间,去掉毫秒
            LocalTime currentTime = LocalTime.now().withNano(0);
            System.out.println(currentTime);
            Thread.sleep(1000);
            //当前时间超过指定时间
            if(currentTime.isAfter(endTime)){
                break;
            }
        }
        System.out.println("时间到");
    }
}
