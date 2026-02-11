package jdk8_time;

import java.time.LocalDate;

public class LocalDateDemo1 {
    public static void main(String[] args) {
        //目標：搞清楚LocalDate的常用方法：代表日期
        //1.得到LocalDate的對象:代表此刻日期
         LocalDate date = LocalDate.now();
         System.out.println(date);

         //2.單獨獲取年月日
        System.out.println(date.getYear());
        System.out.println(date.getMonthValue());
        System.out.println(date.getDayOfMonth());
        System.out.println(date.getDayOfYear());
        //3.獲取星期幾
        System.out.println(date.getDayOfWeek().getValue());
    }
}
