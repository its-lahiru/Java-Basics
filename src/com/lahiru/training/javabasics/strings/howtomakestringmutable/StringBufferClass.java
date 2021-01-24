package com.lahiru.training.javabasics.strings.howtomakestringmutable;

// 1.Mutable
// 2.Thread safe. most used one over StringBuilder
// 3.synchronized: two threads can call methods in StringBuffer at the same time
//   less efficient, slow
// 4.use when there are multiple threads
// 5.use StringBuffer as much as you can, because we don't know exactly whether or not
//   we need multiple threads
public class StringBufferClass {

    public static void main(String[] args) {

        StringBuffer stringBuffer = new StringBuffer("Lahiru");
        stringBuffer.append(" Sandaruwan");
        System.out.println(stringBuffer);

        System.out.println(stringBuffer.compareTo(new StringBuffer("sss")));
        System.out.println(stringBuffer.replace(0, 1, "Mr. L"));
        System.out.println(stringBuffer.reverse());

        System.out.println(stringBuffer.reverse().delete(0, 4));

    }

}
