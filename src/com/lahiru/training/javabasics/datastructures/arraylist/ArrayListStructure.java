package com.lahiru.training.javabasics.datastructures.arraylist;

import java.util.ArrayList;
import java.util.List;

public class ArrayListStructure {

    public static void main(String[] args) {

        List<String> cities = new ArrayList<>();
        System.out.println("Initial size: " + cities.size());

        cities.add("Colombo");
        cities.add("Jaffna");
        cities.add("Ratnapura");
        cities.add("Galle");
        System.out.println("After adding size: " + cities.size());

        cities.remove(3);
        System.out.println("After remove size: " + cities.size());



    }

}
