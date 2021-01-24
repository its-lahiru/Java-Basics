package com.lahiru.training.javabasics.keyword.superkeyword;

public class Mango extends Tree{

    String welcomeMsg = "Hello Mango!";

    // The new keyword invokes the constructor of the SuperSub,
    // which itself calls the parent constructor first and passes
    // the String argument to it.
    public Mango(String name) {
        super(name);
        System.out.println(name);

        // We can use the super keyword to access the overridden method from the child class.
        // The super.printMessage() in constructor calls the parent method from SuperBase.
        super.printWelcomeMessage();

        System.out.println("I am child constructor");
    }

    public void printWelcomeMsg(){
        // We can access the parent variable from the child class by using the super keyword.
        System.out.println(super.welcomeMsg);
    }

    public static void main(String[] args) {
        Mango mango = new Mango("Test");
        mango.printWelcomeMsg();
    }

}
