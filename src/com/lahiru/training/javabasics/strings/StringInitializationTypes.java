package com.lahiru.training.javabasics.strings;


import java.util.Locale;

//There are two ways to create String object:
// 1.By string literal
// 2.By new keyword
public class StringInitializationTypes {

    public static void main(String[] args) {

        ////// String literals
        // Each time you create a string literal, the JVM checks the "string constant pool" first.
        // If the string already exists in the pool, a reference to the pooled instance is returned.
        // If the string doesn't exist in the pool, a new string instance is created and placed in the pool.

        /*
        Why Java uses the concept of String literal?
        To make Java more memory efficient (because no new objects are created if
        it exists already in the string constant pool).
         */
        String name1 = "Calvin";
        String name2 = "Calvin"; // same string is referenced

        //////////////////////////////////////

        ////// Using new keyword
        // In such case, JVM will create a new string object in normal (non-pool) heap memory,
        // and the literal "Welcome" will be placed in the string constant pool.
        // The variable s will refer to the object in a heap (non-pool).
        String s1 = new String("  Hibernate Framework   ");
        System.out.println(s1);




        char[] characters = {'J','A','V','A'};
        //converting char array to string
        String s2 = new String(characters);
        System.out.println(s2);
        // and we can use valueOf method also
        String s3 = String.valueOf(characters);
        System.out.println(s3);

    }

}
