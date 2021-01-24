package com.lahiru.training.javabasics.keyword.statickeyword.staticvariable;

// Class Variables OR Static Fields
public class Car {

    private String name;
    private String engine;

    // use when;
    // When the value of variable is independent of objects
    // When the value is supposed to be shared across all objects
    private static int numberOfCars;
    // Key Points to Remember
    // Since static variables belong to a class, they can be accessed directly using class name and don't need any object reference
    // static variables can only be declared at the class level
    // static fields can be accessed without object initialization
    // we should always refer to static variables using class name


    public Car(String name, String engine) {
        this.name = name;
        this.engine = engine;
        numberOfCars++;
    }

    public static int getNumberOfCars() {
        return numberOfCars;
    }

    public static void setNumberOfCars(int numberOfCars) {
        Car.numberOfCars = numberOfCars;
    }


    public static void main(String[] args) {
        Car.setNumberOfCars(0);
        Car car = new Car("Hummer", "2000CC");
        Car car1 = new Car("Hummer", "2000CC");
        Car car2 = new Car("Hummer", "2000CC");
        Car car3 = new Car("Hummer", "2000CC");

        System.out.println(Car.getNumberOfCars());
    }
}
