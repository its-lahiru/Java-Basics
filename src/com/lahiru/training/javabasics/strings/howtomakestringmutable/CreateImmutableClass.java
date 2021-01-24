package com.lahiru.training.javabasics.strings.howtomakestringmutable;

// There are many immutable classes like String, Boolean, Byte, Short, Integer,
// Long, Float, Double etc. In short, all the wrapper classes and String class is immutable.

// We can also create immutable class by creating final class that have final
// data members as the example given below:
public class CreateImmutableClass {

    public static void main(String[] args) {

        Employee employee = new Employee("Jake");
        System.out.println(employee.getName());

    }

}

final class Employee{

    final String name;

    public Employee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    // The above Employee class is immutable because:
    // 1. The instance variable of the class is final
    //    i.e. we cannot change the value of it after creating an object.
    // 2. The class is final so we cannot create the subclass.
    // 3. There is no setter methods
    //    i.e. we have no option to change the value of the instance variable.

}
