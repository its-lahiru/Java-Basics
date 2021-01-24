package com.lahiru.training.javabasics.datastructures.hashmap;

import java.util.HashMap;
import java.util.Map;

public class HashMapStructure {

    public static void main(String[] args) {

        HashMap<Integer, String> students = new HashMap<Integer, String>();
        students.put(1, "Jack");
        students.put(2, "Amy");
        students.put(3, "Boyle");
        students.put(4, "Jake");

        System.out.println("Students list:");
        for (Map.Entry<Integer, String> student : students.entrySet()){
            System.out.println("Stu Id: " + student.getKey() + ", Stu Name: " + student.getValue());
        }

    }

}
