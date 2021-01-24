package com.lahiru.training.javabasics.havetolearn;

import java.util.Scanner;

public class ReadLineMethod {

//    public static void main(String[] args) {
//
//        Console console = System.console();
//
//        if (console == null) {
//            System.out.println("No console available");
//            return;
//        }
//
//        String customerNumber = console.readLine("Enter customer number: ");
//        String telephone = console.readLine("Enter telephone number: ");
//
//        System.out.println("Customer number is: " + customerNumber + ", and telephone number is: " + telephone);
//
//    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter customer number: ");
        String customerNumber = scanner.nextLine();

        System.out.println("Enter telephone number: ");
        String telephone = scanner.nextLine();

        System.out.println("Customer number is: " + customerNumber + ", and telephone number is: " + telephone);

    }


}
