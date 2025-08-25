package com.code.java8.predicateExmples;

import java.util.function.Predicate;

public class PredicateExample {

    public static void main(String[] args) {

        System.out.println("------------------------------------------------------");

        Predicate<String> stringLength = str -> str.length() > 5;
        System.out.println("\"welcome\" length greater than 5 : "+stringLength.test("welcome"));

        Predicate<Integer> greaterThan50 = x -> x > 50;
        System.out.println("10 is greater than 50 : "+greaterThan50.test(10));

        Predicate<Integer> even = x -> x % 2 == 0;
        System.out.println("10 is even : "+even.test(10));

        System.out.println("------------------------------------------------------");

        Integer[] array = { 10 , 25 , 40 , 72 , 81 ,99};
        System.out.println("Given array is :"+ array);

        System.out.print ("Numbers greater than 50 in array are : ");
        predicateExample(greaterThan50 , array);


        System.out.print("\nEven numbers in array are :");
        predicateExample(even , array);

        System.out.print("\nOdd numbers in array are :");
        predicateExample(even.negate() , array);

        System.out.print("\nEven and greater than 50 numbers in array are :");
        predicateExample(even.and(greaterThan50) , array);

        System.out.print("\nodd and greater than 50 numbers in array are :");
        predicateExample(even.negate().and(greaterThan50) , array);


        System.out.println("\n------------------------------------------------------");
    }

    private static void predicateExample(Predicate<Integer> predicate, Integer[] array) {
        for (Integer integer : array) {
            if (predicate.test(integer)) {
                System.out.print(" "+integer);
            }
        }
    }
}
