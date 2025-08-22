package com.code.java8.lambdaExamples;

interface Sample{
    void test();
}

public class LambdaLocalVariables {
    int instaceVariabe = 100;
    int a=5;

    void checkValueChange(){
        int localVariable = 10;


        Sample sample = ()->{
                    int a=55;
                    System.out.println("Local variable : " +localVariable);
                    System.out.println("Insta`nce variable : " +instaceVariabe);
                    instaceVariabe =1000;
                   // localVariable =500;// This leads to compile time error
                    //local variables in lambda are final

                    System.out.println("Value of local a variable : " +a);
                    System.out.println("Value of class a variable : " +this.a);

        };
        System.out.println("---------------------------------------------------------");

            sample.test();
            System.out.println("Instance variable : " +instaceVariabe);

        System.out.println("---------------------------------------------------------");
    }
    public static void main(String[] args) {

        LambdaLocalVariables lambdaLocalVariables = new LambdaLocalVariables();
        lambdaLocalVariables.checkValueChange();

    }
}
