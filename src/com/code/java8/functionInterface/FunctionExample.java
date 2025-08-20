package com.code.java8.functionInterface;

import java.util.function.Function;

public class FunctionExample {

    public static void main(String[] args) {
        Function<Integer, Integer> fun = x -> x * x;

        System.out.println("------------------------------------------------------");

        System.out.println("Square of 5 : "+fun.apply(5));
        System.out.println("Square of 21 : "+fun.apply(21));

        System.out.println("------------------------------------------------------");

        fun = x -> x * x * x;
        System.out.println("Cube of 5 : "+fun.apply(5));
        System.out.println("Cube of 8 : "+fun.apply(8));

        System.out.println("------------------------------------------------------");

    }
}
