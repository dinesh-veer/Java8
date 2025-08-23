package com.code.java8.methodRefernce;

/**
 * Runnable interface with method reference
 * Below code will generate random output as child or main
 */
public class ThreadMethodRefernce {

    public void methodRefernce() {
        for (int i = 0; i < 3; i++) {
            System.out.println("Using child thread");
        }
    }

    public static void main(String[] args) {
        ThreadMethodRefernce threadMethodRefernce = new ThreadMethodRefernce();
        Runnable runnable = threadMethodRefernce::methodRefernce;
        Thread thread = new Thread(runnable);
        System.out.println("------------------------------------------------------");

        thread.start();
        for (int i = 0; i < 3; i++) {
            System.out.println("Using main thread");
        }

        System.out.println("------------------------------------------------------");

    }
}
