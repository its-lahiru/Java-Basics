package com.lahiru.training.javabasics.keyword.superkeyword;

public class Tree {

    String welcomeMsg = "Hello Tree!";

    public Tree(String name) {
        System.out.println(name);
        System.out.println("I am parent constructor");
    }

    public void printWelcomeMessage(){
        System.out.println(welcomeMsg);
    }
}
