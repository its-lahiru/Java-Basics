package com.lahiru.training.javabasics.casting.referencecasting;

// casting a reference variable does not touch the object it refers to,
// but only labels this object in another way,
// expanding or narrowing opportunities to work with it.


// Upcasting narrows the list of methods and properties available to this object,
// and downcasting can extend it.


// Casting from a subclass to a superclass is called upcasting.
// Typically, the upcasting is implicitly performed by the compiler.
public class UpCasting {

    public static void main(String[] args) {

        Dog dog = new Dog();
        Pitbull pitbull = new Pitbull();

        // superclass variable/reference is assigned with subclass object;
        Animal animal = dog;
        Animal animal1 = pitbull;

        // Using upcasting, we’ve restricted the number of methods available to
        // Dog and Pitbull instances, but haven't changed the instances itself.
        // Now we can’t do anything that is specific to Dog and Pitbull.
        // we can’t invoke run(), strength() on the animal,animal1 variables.

    }

}
