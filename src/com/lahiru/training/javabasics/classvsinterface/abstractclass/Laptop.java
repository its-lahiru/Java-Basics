package com.lahiru.training.javabasics.classvsinterface.abstractclass;

// cannot instantiate, because of unimplemented method
public class Laptop extends PlayGame{

    @Override
    public void run() {
        System.out.println("run game");
    }

    @Override
    public void upgrade() {
        super.upgrade();
    }
}
