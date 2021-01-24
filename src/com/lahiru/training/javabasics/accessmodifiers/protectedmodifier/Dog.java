package com.lahiru.training.javabasics.accessmodifiers.protectedmodifier;

//The access level of a protected modifier is within the package and outside the
// package through child class. If you do not make the child class,
// it cannot be accessed from outside the package.
public class Dog extends Animal {

    public void showName(){
        System.out.println(name);
    }

    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.showName();
    }

}
