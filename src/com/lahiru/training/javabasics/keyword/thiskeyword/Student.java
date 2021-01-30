package com.lahiru.training.javabasics.keyword.thiskeyword;

public class Student {

    // instance variables
    String name;
    int age;

    //this keyword is a reference to the current object whose method is being called (Student object)
    //The keyword is useful for separately identify instance variables from local parameters
    public Student(String name, int age /*local parameters */){
        //this(); calling default constructor
        this.name = name;
        this.age = age;
    }

    public Student() {
        // Referencing Constructors of the Same Class
        this("Lahiru", 25);
    }
}

class PassAsParameter{

    String name;

    // Inside the constructor, we invoke printInstance() method.
    // With this, we pass a reference to the current instance.
    public PassAsParameter(){
        sayHello(this);
    }

    public void sayHello(PassAsParameter passAsParameter){
        System.out.println("Hello world!");
    }


    //We also use this to access the outer class instance from within the inner class
    class ThisInnerClass {
        public ThisInnerClass() {
            // Here, inside the constructor, we can get a reference to the
            // KeywordTest instance with the KeywordTest.this call
            PassAsParameter thisKeyword = PassAsParameter.this;
            //We can go even deeper and access the instance variables
            //like KeywordTest.this.name field.
            String outerString = PassAsParameter.this.name;
        }
    }



    // We can also use this keyword to return the current class instance from the method.
    //To not duplicate the code, here's a full practical example of how it's implemented
    // in the builder design pattern.

    // Link : https://www.baeldung.com/creational-design-patterns

}
