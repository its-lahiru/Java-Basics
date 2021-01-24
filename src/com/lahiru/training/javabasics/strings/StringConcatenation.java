package com.lahiru.training.javabasics.strings;

public class StringConcatenation {

    /*
    In java, string concatenation forms a new string that is the combination of multiple strings. There are two ways to concat string in java:
        1. By + (string concatenation) operator
        2. By concat() method
     */

    public static void main(String[] args) {

        ////////// String Concatenation by + (string concatenation) operator
        String s="Sachin"+" Tendulkar";
        System.out.println(s); //Sachin Tendulkar
        // The Java compiler transforms above code to this:
        System.out.println("String builder");
        String s1 = (new StringBuilder()).append("Sachin").append(" Tendulkar").toString();
        System.out.println(s1);

        //Another Example
        String s3 = 50+30+"Sachin"+40+40;
        ////Note: After a string literal, "Sachin", all the + will be treated as string concatenation operator.
        String s4 = 50+30+"Sachin"+(40+40);
        System.out.println(s3);//80Sachin4040
        System.out.println(s4);//80Sachin80




        //2. String Concatenation by concat() method
        String a1 = "Calvin";
        String a2 = " Harris";
        // The String concat() method concatenates the specified string to the end of current string
        String a3 = a1.concat(a2);
        System.out.println(a3);

    }


}
