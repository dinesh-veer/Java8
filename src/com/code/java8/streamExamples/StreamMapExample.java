package com.code.java8.streamExamples;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMapExample {

    public static void main(String[] args) {
        System.out.println("-------------------------------------------------------");

        Integer[] array = {11,22,33,44,55,66};
        System.out.println("Given number list :"+ Arrays.toString(array));
        Stream<Integer> stream = Stream.of(array);
        List<Integer> squareNumberList = stream
                                        .map(number -> number * number)
                                        .collect(Collectors.toList());

        System.out.println("Squared number list : "+squareNumberList);

        System.out.println("-------------------------------------------------------");


    }
}
