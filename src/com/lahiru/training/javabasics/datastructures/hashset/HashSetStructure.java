package com.lahiru.training.javabasics.datastructures.hashset;

import java.util.HashSet;
import java.util.Set;

public class HashSetStructure {

    public static void main(String[] args) {

        Set<String> names = new HashSet<>();
        names.add("Lahiru");
        names.add("Navin");
        names.add("Kusal");
        names.add("Dileep");

        System.out.println(names);
        for (String name : names){
            System.out.println(name);
        }

    }

}
