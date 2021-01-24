package com.lahiru.training.javabasics.conrolstructures.loops.whileloop;

public class WhileLoop {

    public static void main(String[] args) {

        int[] numbers = new int[]{1,2,3,4,5};
        int i=0;

        while (i<numbers.length){
            System.out.print(numbers[i] + " ");
            i++;
        }

    }

}
