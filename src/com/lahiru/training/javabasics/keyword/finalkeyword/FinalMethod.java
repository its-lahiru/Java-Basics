package com.lahiru.training.javabasics.keyword.finalkeyword;

// can not be overridden
public class FinalMethod {
    public final void eat(){

    }
    public void sleep(){

    }
}

class Cat extends FinalMethod{
    @Override
    public void sleep() {
        super.sleep();
    }

//    @Override
//    public void eat() {
//        super.eat();
//    }
}
