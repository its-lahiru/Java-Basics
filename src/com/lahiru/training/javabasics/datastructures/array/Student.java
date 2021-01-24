package com.lahiru.training.javabasics.datastructures.array;


// An array is an object containing a fixed number of values of the same type
public class Student {

    public static void main(String[] args) {

        // initialize array with size
        int[] studentAges = new int[5];
        studentAges[0] = 10;
        studentAges[1] = 20;
        studentAges[2] = 30;
        studentAges[3] = 40;
        studentAges[4] = 50;

        // initialize array with values
        // number of values determines size of the array
        int[] weight = new int[]{12, 23, 56, 78}; // size = 4

//        for (Integer age: studentAges){
//            System.out.println(age);
//        }
        System.out.println("array length: " + studentAges.length);

        for (int i=0; i < studentAges.length; i++){
            System.out.println("index: " + i + " = " + studentAges[i]);
        }

        // reverse for loop
        for (int i=studentAges.length-1; i>=0; i--){
            System.out.println(studentAges[i]);
        }

        // There are primitive type arrays and object type arrays
        // int, float, boolean, String, Object, etc.
        String[] studentNames = new String[10];


    }

//    When accessing a cell, if the passed index is negative or goes beyond the last cell, Java will throw an ArrayIndexOutOfBoundException.

}
