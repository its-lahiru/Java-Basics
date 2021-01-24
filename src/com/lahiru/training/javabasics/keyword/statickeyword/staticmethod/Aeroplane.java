package com.lahiru.training.javabasics.keyword.statickeyword.staticmethod;

// static methods are also widely used to create utility
// or helper classes so that they can be obtained without
// creating a new object of these classes.
public class Aeroplane {

    void killEngine(){
        System.out.println("Engine shut down..");
    }

    // static methods also belong to a class instead of the object,
    // and so they can be called without creating the object of the
    // class in which they reside. They're meant to be used without
    // creating objects of the class
    static void accelerate(){
        System.out.println("Accelerating...");
    }

    // Compelling Reasons to Use static Methods
    // 1. To access/manipulate static variables and other static methods that don't depend upon objects
    // 1. static methods are widely used in utility and helper classes

    public static void main(String[] args) {

        Aeroplane aeroplane = new Aeroplane();
        aeroplane.killEngine();

        Aeroplane.accelerate();
    }

    // Key Points to Remember
    // 1. static methods in Java are resolved at compile time. Since method overriding
    //    is part of Runtime Polymorphism, so static methods can't be overridden.
    // 2. abstract methods can't be static.
    // 3. static methods cannot use this or super keywords.


    // The following combinations of the instance, class methods and variables are valid
    // 1. Instance methods can directly access both instance methods and instance variables.
    // 2. Instance methods can also access static variables and static methods directly
    // 3. static methods can access all static variables and other static methods
    // 4. static methods cannot access instance variables and instance methods directly;
    //    they need some object reference to do so

}
