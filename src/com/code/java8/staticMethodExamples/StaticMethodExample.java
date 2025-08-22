package com.code.java8.staticMethodExamples;

interface StaticInterface{
    static void method(){
        System.out.println("Static method inside interface called");
    }
}
public class StaticMethodExample {

    public static void main(String[] args) {
        StaticInterface.method();
    }
}
