package com.lahiru.training.javabasics.classvsinterface.intefaceformat;

class Car implements Driveable{

    @Override
    public void honk() {
        System.out.println("honk honk");
    }

    @Override
    public void drive() {
        System.out.println("vroom vroom");
    }
}
