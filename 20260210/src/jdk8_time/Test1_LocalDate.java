package jdk8_time;

import java.time.LocalDate;

public class Test1_LocalDate {
    public static void main(String[] args) {

        LocalDate ld = LocalDate.now();
        System.out.println(ld);

        int year = ld.getYear();
        int month = ld.getMonthValue();
        int day = ld.getDayOfMonth();
        int dayOfYear = ld.getDayOfYear();
        int dayOfMonth = ld.getDayOfMonth();
        int dayOfWeek = ld.getDayOfWeek().getValue();
        System.out.println(year);
        System.out.println(month);
        System.out.println(day);
        System.out.println(dayOfYear);
        System.out.println(dayOfMonth);
        System.out.println(dayOfWeek);
        //2.直接修改某個訊息：withYear,withMonth ,withDayOfMonth,withDayOfYea
        LocalDate ld2 = ld.withYear(2099);
        LocalDate ld3 = ld2.withMonth(12);
        System.out.println(ld2);
        System.out.println(ld3);
        System.out.println(ld);

        //3.把某個訊息加多少：plus

        //4.把某個訊息減多少minus
        //5.獲取指定日期的LocalDate對象： public  static LocalDate of(int year, int month ,int dayOfMonth)
        //6.判斷2個日期對象，是否相等，是前還是后：equals，isBefore,isAfter

    }
}
