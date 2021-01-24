package com.lahiru.training.javabasics.enumerations;

// can not extent or implement
// helps with if we have many static variables
public enum TransportWithSpeed {

    TRAIN(100), BUS(70), CAR(120), PLANE(400), BOAT(40), FOOT(5);

    int speed;

    TransportWithSpeed(int speed){
        this.speed = speed;
    }

}
