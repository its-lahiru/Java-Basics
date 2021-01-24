package com.lahiru.training.javabasics.conrolstructures.loops.reverseforloop;

public class ReverseForLoop {

    public static void main(String[] args) {

        int[] numberArray = new int[10];

        System.out.println("Array");
        for (int i=0; i<numberArray.length; i++){
            numberArray[i] = i;
            System.out.println("Index:" + i + " = " + numberArray[i]);
        }


        System.out.println("Reversed array:");
        for (int j=numberArray.length-1; j>=0; j--){
            System.out.println("Index:" + j + " = " + numberArray[j]);
        }

    }

}
