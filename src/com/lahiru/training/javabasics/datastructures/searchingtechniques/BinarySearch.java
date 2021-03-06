package com.lahiru.training.javabasics.datastructures.searchingtechniques;

import java.util.Arrays;

public class BinarySearch {

    static void binarySearch(int[] arr, int key){
        int first = 0;
        int last = arr.length - 1;
        Arrays.sort(arr);

        int mid = (first + last)/2;

        while (first <= last){
            if (arr[mid] < key){
                first = mid + 1;
            } else if (arr[mid] == key){
                System.out.println("Element found at index: " + mid);
                break;
            } else {
                last = mid - 1;
            }

            mid = (first+last)/2;
        }

        if (first > last){
            System.out.println("Element not found!");
        }
    }

    public static void main(String[] args) {

        int[] numbers = {10,20,30,40,50,60};
        int key = 50;

        binarySearch(numbers, key);

    }

}
