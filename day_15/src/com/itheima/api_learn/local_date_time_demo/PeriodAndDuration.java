package com.itheima.api_learn.local_date_time_demo;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
/*
    Duration时间间隔类(时分秒)
        public static Duration between(开始时间,结束时间)计算两个时间的间隔,注意:参数是LocalDateTime
 */
public class PeriodAndDuration {
    public static void main(String[] args) {
        LocalDate startTime = LocalDate.of(2023,10,16);
        LocalDate endTime = LocalDate.of(2023,12,12);
        Period between = Period.between(startTime,endTime);//传入的两个参数,一个参数是开始时间,一个参数是结束时间
        System.out.println(between.getYears());
        System.out.println(between.getMonths());
        System.out.println(between.getDays());

        System.out.println("====================");
        LocalDateTime startTime1 = LocalDateTime.of(2023, 10, 16, 10, 44, 56);
        LocalDateTime endTime1 = LocalDateTime.of(2023, 11, 5, 14, 23, 56);
        Duration time = Duration.between(startTime1, endTime1);//Temporal startInclusive, Temporal endExclusive
        System.out.println(time);
        System.out.println(time.toDays());
    }
}
