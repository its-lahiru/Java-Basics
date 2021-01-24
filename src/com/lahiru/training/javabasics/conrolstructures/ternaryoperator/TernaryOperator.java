package com.lahiru.training.javabasics.conrolstructures.ternaryoperator;

import java.util.Scanner;

// We can use a ternary operator as a shorthand expression that works like an if/else statement.
public class TernaryOperator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your language:\n1.Sinhala \n2.English");
        String language = scanner.nextLine();

        // While ternary can be a great way to make our code more readable,
        // it isn't always a good substitute for if/else
        System.out.println(language.equals("Sinhala") ? "Sinhala is choosed" : "English is choosed");

    }

}
