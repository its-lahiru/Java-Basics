package com.lahiru.training.javabasics.datastructures.sortingtechniques;

import java.util.Arrays;

public class BubbleSort {

    public static void bubbleSort(int[] array){
        for (int i=0; i<array.length; i++){
            for (int j=1; j< array.length; j++){
                if (array[j] < array[j-1]){
                    // swap elements
                    int temp = array[j];
                    array[j] = array[j-1];
                    array[j-1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int arr[] ={3,60,35,2,45,320,5};

        System.out.println("Before Sort");
        System.out.println(Arrays.toString(arr));

        System.out.println();

        bubbleSort(arr); //sorting array elements using bubble sort
        System.out.println("Array After Bubble Sort");
        System.out.println(Arrays.toString(arr));

    }
}
