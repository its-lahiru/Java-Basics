package com.lahiru.training.javabasics.datastructures.array;

import java.util.Arrays;

public class ArraySearch {

    public static void main(String[] args) {

        int[] numbers = new int[]{1,8,2,89,3,34,4,0,5};

        for (int i=0; i<numbers.length; i++){
            if (numbers[i] == 3){
                System.out.println("found at index: " + i);
                break;
            }
        }

        //// binary search method (for sorted arrays)
        int[] numbers2 = new int[]{1,8,2,89,3,34,4,0,5};
        Arrays.sort(numbers2);

        int index = Arrays.binarySearch(numbers2, 34);
        System.out.println("fount at index: " + index);

    }

}
