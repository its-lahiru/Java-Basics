package com.lahiru.training.javabasics.casting.primitivecasting;

public class Application {

    public static void main(String[] args) {

        // size increment downwards
        byte a = 10; //8 bit
        short b; //16 bit
        char c; //16 bit
        int d; //32 bit
        long e; //64 bit
        float f = 20; // 32 bit
        double g; //64 bit
        boolean h;

        // upcasting. cast into a larger sized type
        // automatically done by java
        int number = a;

        // downcasting. cast into a smaller sized type
        int number2 = (int) f;

        System.out.println("upcasting: " + number + ", downcasting: " + number2);



    }

}
