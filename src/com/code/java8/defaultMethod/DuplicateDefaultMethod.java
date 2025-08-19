package com.code.java8.defaultMethod;

interface First{
    default void print(){
        System.out.println("First interface");
    }
}

interface Second{
    default void print(){
        System.out.println("Second interface");
    }
}
//Explicit need to override as leads to compile time error
public class DuplicateDefaultMethod implements First, Second {

    @Override
    public void print() {
        First.super.print();
        //Second.super.print();
    }

    public static void main(String[] args) {
        DuplicateDefaultMethod dm = new DuplicateDefaultMethod();
        dm.print();
    }

}
