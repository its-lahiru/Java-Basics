package com.lahiru.training.javabasics.classvsinterface.concreteclass;

// no unimplemented methods, so we can create Animal class instances
//all classes which are not abstract, we can call concrete classes
public class Animal extends Eat implements Height {

    public void eat(){
        System.out.println("Animal eats");
    }

    @Override
    void moveMouth() {
        super.moveMouth();
    }

    @Override
    public void calculateHeight() {
        System.out.println("Calculating height");
    }

    public String move(){
        return "Moving";
    }

}
