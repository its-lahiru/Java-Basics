package com.lahiru.training.javabasics.datastructures.array;

public class ConcatenatingArray {

    public static void main(String[] args) {

        int[] arr1 = new int[]{1,2,3,4};
        int[] arr2 = new int[]{5,6,7,8};

        int[] resultArr = new int[arr1.length + arr2.length];
        for (int i=0; i<resultArr.length; i++){
            resultArr[i] = (i < arr1.length ? arr1[i] : arr2[i - arr1.length]);
        }

        for (int number: resultArr) {
            System.out.print(number + " ");
        }

    }

}
