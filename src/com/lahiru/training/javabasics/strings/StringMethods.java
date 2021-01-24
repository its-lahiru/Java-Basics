package com.lahiru.training.javabasics.strings;

public class StringMethods {

    public static void main(String[] args) {

        String filmName = new String("Avengers Endgame");

        String[] characters = filmName.split(" ");
        System.out.println("first part: " + characters[0]);
        System.out.println("second part: " + characters[1]);

        // returns string length
        System.out.println("String length: " + filmName.length());

        // returns substring for given begin index and end index.
        System.out.println("returns substring (0,7): " + filmName.substring(0, 7));

        // returns substring for given begin index.
        System.out.println("returns substring from (9): " + filmName.substring(9));

        System.out.println(filmName.isEmpty());

        String genre = " [Action/Fantasy/Comic]";
        System.out.println("String concatenation: filmName + genre = " + filmName.concat(genre));

        String filmName2 = "AVENGERS ENDGAME";
        // compares another string. It doesn't check case.
        System.out.println("compare string ignoring the case: " + filmName.equalsIgnoreCase(filmName2));

        // returns char value for the particular index
        System.out.println("return character at specified index: " + filmName.charAt(0));


    }

}
