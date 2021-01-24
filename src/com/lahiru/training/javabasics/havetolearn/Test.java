package com.lahiru.training.javabasics.havetolearn;

public class Test {

    public static void main(String[] args){

        String myName = "Atalla Wedaralalage Lahiru Sandaruwan";
        String[] nameParts = myName.split(" ");

        for(String namePart : nameParts){
            System.out.println(namePart);
        }

    }

}
