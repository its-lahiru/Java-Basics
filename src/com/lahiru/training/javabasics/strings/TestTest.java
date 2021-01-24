package com.lahiru.training.javabasics.strings;

public class TestTest {

    public static void main(String[] args) {

        System.out.println(capitalizeFirstChar("A list of top Java String FAQs or interview questions are given below. These questions can be asked by the interviewer"));

    }

    //// Java Program to capitalize each word in String
    public static String capitalizeFirstChar(String sentence){

        String[] words = sentence.split(" ");
        String capitalizedSentence = "";

        for (String word : words){
            String firstChar = word.substring(0,1);
            String restOfWord = word.substring(1);

            capitalizedSentence += firstChar.toUpperCase() + restOfWord + " ";
            // capitalizedSentence.append(firstChar.toUpperCase()).append(restOfWord).append(" ");

        }
        return capitalizedSentence.trim();

    }

//    public static String reverseWord(String sentence){
//
//        String[] words = sentence.split(" ");
//        String reveredSentence = "";
//
//        for (int i=0; i< words.length; i++){
//            for (int j=words[i].length()-1; j>=0; j--){
//
//                String reversedWord = words[i].charAt(words[i][j]);
//
//            }
//        }
//
//    }

}
