package com.lahiru.training.javabasics.conrolstructures.loops.forloop;

import java.util.Arrays;

public class ForLoop {

    public static void main(String[] args) {

        double[] prices = new double[]{1.99, 0.99, 29.99, 99.99, 7.99};
        Arrays.sort(prices);
        for (int i=0; i<prices.length; i++){
            System.out.print(prices[i] + ", ");
        }

    }

}
