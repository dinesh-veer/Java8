package com.code.java8.defaultMethod;

interface SampleInterface{

    default void print(){
        System.out.println("This is from default method");
    }
}
public class OverriddenDefaultMethod  implements SampleInterface{

    @Override
    public void print() {
        System.out.println("This is from Child class");
    }
    public static void main(String[] args) {
        SampleInterface obj = new OverriddenDefaultMethod();
        obj.print();//it will call overridden method from child class
    }
}
