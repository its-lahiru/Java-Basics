package com.lahiru.training.javabasics.keyword.finalkeyword;


// can not be extended
public final class FinalClass {
    int weight;
}

//public class Cat extends FinalClass{
//
//}

class Application{
    public static void main(String[] args) {
        //Note that the final keyword in a class declaration
        // doesn’t mean that the objects of this class are immutable.
        // We can change the fields of Cat object freely
        FinalClass finalClass = new FinalClass();
        finalClass.weight = 100;
        System.out.println(finalClass.weight);
        finalClass.weight = 200;
        System.out.println(finalClass.weight);

    }
}
