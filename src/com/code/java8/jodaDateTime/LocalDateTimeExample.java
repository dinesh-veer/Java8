package com.code.java8.jodaDateTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;

public class LocalDateTimeExample {

    public static void main(String[] args) {

        LocalDate localDate = LocalDate.now();
        System.out.println("Current local date : " +localDate);

        int year = localDate.getYear();
        int month = localDate.getMonthValue();
        int day = localDate.getDayOfMonth();
        System.out.println(day + "/" + month + "/" + year);

        LocalTime localTime =   LocalTime.now();
        System.out.println("Current local time : " +localTime);

        System.out.println("------------------------------------------------------");

        int hour = localTime.getHour();
        int minute = localTime.getMinute();
        int second = localTime.getSecond();
        System.out.println("Time : "+ hour + ":" + minute + ":" + second);

        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("Current local date : " +localDateTime);
        System.out.println("Day of week : " +localDateTime.getDayOfWeek());
        System.out.println("Month : "+localDateTime.getMonthValue());
        System.out.println("Year : "+localDateTime.getYear());
        System.out.println("Hour : "+localDateTime.getHour());
        System.out.println("Minute : "+localDateTime.getMinute());
        System.out.println("Second : "+localDateTime.getSecond());

        System.out.println("------------------------------------------------------");

        System.out.println( "After 6 months : "+ localDateTime.plusMonths(6));
        System.out.println( "Before 6 days : "+ localDateTime.minusDays(6));

        System.out.println("------------------------------------------------------");

        LocalDate birthDate = LocalDate.of(1990, 5, 2);

        LocalDate currentDate = LocalDate.now();
        Period period = Period.between(birthDate, currentDate);
        System.out.printf("Age is %d years, %d months and %d days.\n", period.getYears(), period.getMonths(),period.getDays());
        System.out.println("Days : " + ChronoUnit.DAYS.between(birthDate, localDate));

        System.out.println("------------------------------------------------------");

    }
}
