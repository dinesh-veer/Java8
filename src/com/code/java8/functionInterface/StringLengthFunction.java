package com.code.java8.functionInterface;

import java.time.LocalDate;
import java.util.function.Function;

public class StringLengthFunction {

    public static void main(String[] args) {
        Function<String, Integer> function = String::length;

        System.out.println("------------------------------------------------------");

        System.out.println("length of hello : " +function.apply("hello"));
        System.out.println("length of stringssdsdsdsdsdsdsdsd : "+function.apply("stringssdsdsdsdsdsdsdsd"));

        System.out.println("------------------------------------------------------");

    }
}
