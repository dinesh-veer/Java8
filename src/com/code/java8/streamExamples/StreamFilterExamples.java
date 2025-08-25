package com.code.java8.streamExamples;

import com.sun.jdi.ObjectCollectedException;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamFilterExamples {

    public static void main(String[] args) {

        System.out.println("-----------------------------------------------");

        List<Integer> integerList = Arrays.asList(1, 2, 3, 4, 5);

        System.out.println("Given List : "+integerList);
        List<Integer> evenNumberList = integerList
                                        .stream()
                                        .filter(number -> number%2 ==0)
                                        .collect(Collectors.toList());

        System.out.println("Filtered even List : "+evenNumberList);
        System.out.println("Maximum number from list : "+Collections.max(integerList));
        System.out.println("Minimum number from list : "+integerList.stream().min(Comparator.naturalOrder()).orElseThrow());

        System.out.println("-----------------------------------------------");

        List<String> stringList = Arrays.asList("Dinesh", "Don", "Veer", "Sam", "Johnt", "Rick", "Gandhi", "Michel", "Zelensky");
        System.out.println("Given List : "+stringList);

        List<String> filteredList = stringList.stream()
                                        .filter(string -> string.length()>5)
                                                .collect(Collectors.toUnmodifiableList());
        System.out.println("Filtered list with length >5 : "+filteredList);
        System.out.println("Number of elements having length >4 : " +stringList.stream()
                                                                .filter(string -> string.length()>4)
                                                                .count());

        List<String> sortedList = stringList.stream().sorted().collect(Collectors.toList());
        System.out.println("Sorted list : "+sortedList);

        List<String> descSortedList = stringList.stream()
                       // .sorted(Comparator.reverseOrder())//Both can be used
                        .sorted((first, second) -> second.compareTo(first))
                        .collect(Collectors.toList());
        System.out.println("Sorted list in descending order : "+descSortedList);

        System.out.println("List in uppercase : "+stringList.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList()));

        String[] stringArray = stringList.stream().toArray(String[]::new);
        System.out.println("Converted string array : "+ Arrays.toString(stringArray));



        System.out.println("-----------------------------------------------");

    }
}
