package com.lahiru.training.javabasics.strings;

// Immutable simply means unmodifiable or unchangeable.
// Once string object is created its value can not be changed, if we try to change
// a new string object will created.
public class WhyStringImmutable {

    public static void main(String[] args){

        // "s" is stored in string constant pool in HEAP memory
        String s="Sachin";
        // Does not create new object, but refer the existing "Sachin" object in String constant pool.
        // So "s" and "ss" are both refer to the same object in String constant pool.
        String ss = "Sachin";
        // new keyword creates new object. But, new object also refers "Sachin" object in String
        // constant pool, because values are same
        String sss = new String("Sachin");
        // After assign new value to the "s" reference it will Creates new object
        // in String constant pool without changing original String value which is "Sachin"
        s = "Calvin";
        System.out.println(s);
        // So, changes in "s" does not affect to the "ss", because of String is immutable.
        System.out.println(ss);



        // If we explicitly assign it to the reference variable, it will refer
        // to new "Sachin Tendulkar" object.
        String s1="Sachin";
        s1 = s1.concat(" Tendulkar");
        System.out.println(s1);
    }


    //// Why string objects are immutable in java?
    // Because java uses the concept of string literal.Suppose there are
    // 5 reference variables, all refers to one object "Sachin".
    // If one reference variable changes the value of the object, it will be
    // affected to all the reference variables. That is why string objects are immutable in java.


}
