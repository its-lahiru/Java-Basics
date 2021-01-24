package com.lahiru.training.javabasics.datastructures.array;

import java.util.Arrays;

public class ArrayCopying {

    public static void main(String[] args) {

        int[] numbers = new int[]{1,8,2,89};

        int[] numbersCopy = Arrays.copyOf(numbers, 3);

    }

}
