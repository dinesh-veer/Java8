package com.code.java8.methodRefernce;


interface InterfaceExample{
    void test();
}
public class MethodRefernceExample {

    public static void anotherTest(){
        System.out.println("Inside anotherTest");
    }

    public static void main(String[] args) {
        InterfaceExample interfaceExample = MethodRefernceExample::anotherTest;
        /**
         * Above code it shortened code for
         * InterfaceExample interfaceExample = () -> MethodRefernceExample.anotherTest();
         */

        interfaceExample.test();// call anotherTest method and print message
    }
}
