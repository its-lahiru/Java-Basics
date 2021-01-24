package com.lahiru.training.javabasics.strings;

public class StringComparison {

    public static void main(String[] args) {

        ////////////// String compare by equals() method

        // The String equals() method compares the original content of the string.
        // It compares values of string for equality

        // String class provides two methods:
        // 1. public boolean equals(Object another) compares this string to the specified object.
        // 2. public boolean equalsIgnoreCase(String another) compares this String to another string, ignoring case.
        System.out.println("String compare by equals() method");
        String s1 = "Calvin";
        String s2 = "Calvin";
        String s3 = new String("Calvin");
        String s4 = "Skrillex";
        String s5 = "CALVIN";
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
        System.out.println(s1.equals(s4));
        System.out.println(s1.equals(s5));
        System.out.println(s1.equalsIgnoreCase(s5));


        ///////////String compare by == operator
        // The = = operator compares references not values.
        System.out.println("String compare by == operator");
        String a1 = "Colombo";
        String a2 = "Colombo";
        String a3 = new String("Colombo");
        System.out.println(a1 == a2); //true (because both refer to same instance)
        System.out.println(a1 == a3); //false(because s3 refers to instance created in non-pool)



        ////////String compare by compareTo() method
        // The String compareTo() method compares values lexicographically and returns an integer
        // value that describes if first string is less than, equal to or greater than second string.
        /*
        Suppose s1 and s2 are two string variables. If:
            s1 == s2 : 0
            s1 > s2  : positive value
            s1 < s2  : negative value
         */
        System.out.println("String compare by compareTo() method");
        String c1 = "NY";
        String c2 = "NY";
        String c3 = "NYC";
        System.out.println(c1.compareTo(c2));
        System.out.println(c1.compareTo(c3));
        System.out.println(c3.compareTo(c1));


    }

}
