package com.lahiru.training.javabasics.casting.referencecasting;

//What if we want to use the variable of type Animal to invoke a method
// available only to Dog class? Here comes the downcasting.
// It’s the casting from a superclass to a subclass.
public class DownCasting {

    public static void main(String[] args) {

        Animal animal = new Dog();
        Animal animal1 = new Pitbull();

        //The inner parentheses and the type they contain are sometimes called
        // the cast operator. Note that external parentheses are also
        // needed to compile the code.
        if (animal instanceof Dog){
            ((Dog) animal).run();
        }

        // cast() method
        if (Pitbull.class.isInstance(animal1)){
            Pitbull pitbull = Pitbull.class.cast(animal1);
            pitbull.strength();
        }

    }

}
