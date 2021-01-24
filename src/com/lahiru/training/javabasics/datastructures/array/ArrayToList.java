package com.lahiru.training.javabasics.datastructures.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayToList {

    public static void main(String[] args) {

        int[] numbers = new int[]{123, 242, 464, 786, 123};
        List<Integer> numberList = new ArrayList<>();

        for (int i=0; i<numbers.length; i++){
            numberList.add(numbers[i]);
        }
        System.out.println(numberList);



        // OR we can use this method
        Integer[] numbers2 = new Integer[]{123, 242, 464, 786, 123};
        List<Integer> numberList2 = Arrays.asList(numbers2);
        System.out.println(numberList2);
        /*
        The static method Arrays.asList takes a varargs argument and creates a list with
        the passed values. Unfortunately, this method comes with some drawbacks:
        1. It's not possible to use an array of primitive types
        2. We can't add or remove elements from the created list,
           as it'll throw an UnsupportedOperationException
         */

    }

}
