package com.lahiru.training.javabasics.strings;

// Java String is a powerful concept because everything is treated
// as a string if you submit any form in window based, web based or mobile application
public class MethodsOfString {

    public static void main(String[] args) {

        String s1 = new String("  Hibernate Framework   ");
        System.out.println(s1);

        // The java string toUpperCase() method converts this string into uppercase letter
        // and string toLowerCase() method into lowercase letter.
        System.out.println(s1.toLowerCase());
        System.out.println(s1.toUpperCase());

        /// The string trim() method eliminates white spaces before and after string.
        System.out.println(s1.trim());


        // Java String startsWith() and endsWith() method
        String name = "Calvin";
        System.out.println(name.startsWith("Ca"));
        System.out.println(name.endsWith("in"));


        /// Java String charAt() method
        // The string charAt() method returns a character at specified index.
        String a = "Skrillex";
        System.out.println(a.charAt(0));
        System.out.println(a.charAt(7));


        // Java String length() method
        // The string length() method returns length of the string.
        String a1 = "Challenger";
        System.out.println(a1.length());


        /// Java String intern() method
        // A pool of strings, initially empty, is maintained privately by the class String.
        // When the intern method is invoked, if the pool already contains a string equal to
        // this String object as determined by the equals(Object) method, then the string from
        // the pool is returned. Otherwise, this String object is added to the pool and
        // a reference to this String object is returned.
        String a3 = "Mustang";
        String a4 = a3.intern();
        System.out.println(a4);



        /// Java String valueOf() method
        // The string valueOf() method coverts given type such as int, long, float, double,
        // boolean, char and char array into string.
        int number = 1005;
        String numberString = String.valueOf(number);
        System.out.println(numberString);

        char[] charArray = {'c', 'a', 'l', 'v', 'i', 'n'};
        String numberArrayString = String.valueOf(charArray);
        System.out.println(numberArrayString);



        ///// Java String replace() method
        // The string replace() method replaces all occurrence of first sequence of character
        // with second sequence of character.
        String sentence = "Java is a programming language. Java is a platform. Java is an Island.";
        String k = sentence.replace("a", "k");
        System.out.println(k);
        String replaceString = sentence.replaceAll(" ", "-");
        System.out.println(replaceString);
        String replaceString2 = sentence.replaceAll("Java", "\"Java\"");
        System.out.println(replaceString2);


    }

}
