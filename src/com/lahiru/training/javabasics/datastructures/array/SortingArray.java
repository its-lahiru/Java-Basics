package com.lahiru.training.javabasics.datastructures.array;

import java.util.Arrays;

public class SortingArray {

    public static void main(String[] args) {

        int[] numbers = new int[]{213,209,3333,401,5};
        Arrays.sort(numbers);

        for (int number : numbers) {
            System.out.println(number);
        }


        ///////////////////////
        Integer[] numbers2 = new Integer[]{213,209,3333,401,5};
        Arrays.sort(numbers2);

        for (int number : numbers2) {
            System.out.println(number);
        }

    }

}
