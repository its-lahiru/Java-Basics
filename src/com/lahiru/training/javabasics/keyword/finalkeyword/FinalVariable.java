package com.lahiru.training.javabasics.keyword.finalkeyword;

// Variables marked as final can't be reassigned.
// Once a final variable is initialized, it can’t be altered.
public class FinalVariable {

    private final int age = 10;

    private void changeAge(){
//        this.age = 20;
        System.out.println(this.age);
    }

}
