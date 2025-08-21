package com.code.java8.jodaDateTime;

import java.time.Year;
import java.time.ZoneId;
import java.util.Scanner;

public class LeapYearExample {

    public static void main(String[] args) {
        System.out.println("------------------------------------------------------");

        Year year = Year.of(2017);
        System.out.println(year.isLeap() ? "Year is leap: " + year : "Year is not leap: " + year);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year: ");
        int year1 = sc.nextInt();
        year = Year.of(year1);
        System.out.println(year.isLeap() ? "Year is leap: " + year : "Year is not leap: " + year);

        System.out.println("------------------------------------------------------");

        ZoneId zoneId = ZoneId.systemDefault();
        System.out.println("Zone Id : "+ zoneId);

        System.out.println("------------------------------------------------------");

    }
}
