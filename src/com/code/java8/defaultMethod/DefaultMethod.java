package com.code.java8.defaultMethod;

interface Sample{

    default void print(){
        System.out.println("This is default method");
    }
}

public class DefaultMethod implements Sample {

    public static void main(String[] args) {
        DefaultMethod defaultMethod = new DefaultMethod();
        defaultMethod.print();//It will call default method from interface
    }
}
