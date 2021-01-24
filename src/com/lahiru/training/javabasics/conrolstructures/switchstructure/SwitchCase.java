package com.lahiru.training.javabasics.conrolstructures.switchstructure;

import java.util.Scanner;

public class SwitchCase {

    public static void main(String[] args) {

//        String language = "Tamil";

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your language:");
        String language = scanner.nextLine();

        switch (language){
            case "Sinhala":
                System.out.println("Language is changed to Sinhala..");
                break;
            case "English":
                System.out.println("Language is changed to English..");
                break;
            case "Tamil":
                System.out.println("Language is changed to Tamil..");
                break;
            default:
                System.out.println("Something went wrong!! Try again..");
                break;
        }

    }

}
