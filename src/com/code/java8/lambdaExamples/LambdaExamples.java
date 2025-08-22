package com.code.java8.lambdaExamples;

@FunctionalInterface
interface Addition{
    int add(int a, int b);
}

interface Square{
    int square(int a);
}

interface StringLength{
    int length(String s);
}
public class LambdaExamples {

    public static void main(String[] args) throws InterruptedException {

        System.out.println("------------------------------------------------------");

        Addition add = (a, b) -> a + b;
        System.out.println("Addition of 10 and 20 : "+add.add(10, 20));

        Square square = (num) -> num * num;
        System.out.println("Square of 22 : "+square.square(22));

        StringLength length = (str) -> str.length();
        System.out.println("Length of string \"Hello Team\" : "+ length.length("Hello Team"));

        System.out.println("------------------------------------------------------");

        Thread.sleep(500);

        //Below output will be random

        Runnable runnable = () ->{
            for(int i=0; i<3; i++){
                System.out.println("Child thread");
            }
        };

        Thread thread = new Thread(runnable);
        thread.start();

        for(int i=0; i<3; i++){
            System.out.println("Main thread");
        }

        System.out.println("-------------------------------------------------------");


    }

}
