package com.code.java8.supplierExamples;

import java.util.Random;
import java.util.function.Supplier;

public class SupplierExample {

    public static void main(String[] args) {

        Supplier<String> supplier = () -> "Hello team";
        System.out.println("Get value from supplier :" +supplier.get());

        Supplier<Integer> randomNumber = () -> new Random().nextInt(10);//random number between 10
        System.out.println("Get value from randomNumber :" +randomNumber.get());
    }
}
