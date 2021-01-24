package com.lahiru.training.javabasics.datastructures.sortingtechniques;

/*
Algorithm
1.Set MIN to location 0
2.Search the minimum element in the list
3.Swap with value at location MIN
4.Increment MIN to point to next element
5.Repeat until the list is sorted
 */
public class SelectionSort {

    static int[] selectionSorting(int[] array){

        for (int i=0; i< array.length; i++){
            int minIndex = i;
            for (int j = i+1; j< array.length; j++){
                if (array[j] < array[minIndex]){
                    minIndex = j;
                }
            }
            int temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }
        return array;
    }

    public static int[] printArray(int[] array){
        for (int i : array){
            System.out.print(i + " ");
        }
        System.out.println("End of array");
        return array;
    }

    public static void main(String[] args) {

        int[] numbers = {9, 14, 3, 2, 43, 11, 58, 22};
        printArray(numbers);

        selectionSorting(numbers);
        printArray(numbers);

    }

}
