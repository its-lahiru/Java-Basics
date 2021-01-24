package com.lahiru.training.javabasics.strings.howtomakestringmutable;

// 1.Mutable
// 2.Not thread safe
// 3.non-synchronized: two threads can not call methods in StringBuffer at the same time
// 4.Use when there is one thread
// 5.more efficient, faster
public class StringBuilderClass {

    public static void main(String[] args) {

        StringBuilder stringBuilder = new StringBuilder("Lahiru");
        stringBuilder.append(" Sandaruwan");
        System.out.println(stringBuilder);

        System.out.println(stringBuilder.compareTo(new StringBuilder("sss")));
        System.out.println(stringBuilder.replace(0, 1, "Mr. L"));
        System.out.println(stringBuilder.reverse());
        System.out.println("reverse operation is permanent: " + stringBuilder);

        // have to reverse back in order to delete necessary substring
        System.out.println(stringBuilder.reverse().delete(0 /*inclusive*/, 4 /*exclusive*/));
    }
}