package com.lahiru.training.javabasics.conrolstructures.breakstructure;

import java.util.Arrays;

// We need to use break to exit early from a loop.
public class BreakStatement {

    public static void main(String[] args) {

        int[] ages = new int[]{25, 24, 26, 28, 50, 22};
        Arrays.sort(ages);

        for (int age: ages){
            // Here, we are looking for a age in a list of ages, and we want to
            // stop looking once we've found it. A loop would normally go to completion,
            // but we've used break here to short-circuit that and exit early.
            if (age == 26){
                break;
            }
            System.out.println("Age = " + age + ", meets the age requirement.");
        }

    }

}
