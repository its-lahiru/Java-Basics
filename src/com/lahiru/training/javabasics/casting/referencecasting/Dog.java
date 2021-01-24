package com.lahiru.training.javabasics.casting.referencecasting;

import com.lahiru.training.javabasics.casting.referencecasting.Animal;

public class Dog extends Animal {

    @Override
    public void eat() {
        System.out.println("Dog eats");
    }

    public void run(){
        System.out.println("Dog runs");
    }
}
