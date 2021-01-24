package com.lahiru.training.javabasics.strings;

public class SubString {

    public static void main(String[] args) {

        // A part of string is called substring. In other words, substring is a subset of another string.
        // You can get substring from the given string object by one of the two methods
        /*
                startIndex: inclusive
                endIndex: exclusive
         */

        String hello = "Hello, World!";
        // public String substring(int startIndex, int endIndex): This method returns new String object
        // containing the substring of the given string from specified startIndex to endIndex.
        System.out.println(hello.substring(0, 2));

        // public String substring(int startIndex):
        // This method returns new String object containing the substring of the given string from specified startIndex.
        System.out.println(hello.substring(7));


    }

}
