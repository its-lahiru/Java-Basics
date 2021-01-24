package com.lahiru.training.javabasics.conrolstructures.ifelsestructure;

import java.util.Scanner;

public class IfElse {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your marks: ");
        int marks = scanner.nextInt();

        System.out.println(IfElse.getGrade(marks));

    }

    static String getGrade(int marks){

        if (75 <= marks && marks <= 100){
            return "A";
        } else if(65<=marks){
            return "B";
        } else if (55<=marks){
            return "C";
        } else if (40<=marks){
            return "Pass";
        } else {
            return "Try again";
        }

    }

}
