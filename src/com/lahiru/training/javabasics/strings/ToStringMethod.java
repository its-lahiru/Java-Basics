package com.lahiru.training.javabasics.strings;

// The toString() method returns the string representation of the object.
public class ToStringMethod {

    public static void main(String[] args) {

        // without toString() method
        /*
        Printing calvin return the hashcode values of the objects. but we want to print the
        values of these objects. Since java compiler internally calls toString() method,
        overriding this method will return the specified values
         */
        Student calvin = new Student(001, "Calvin Harris", 26);
        System.out.println(calvin);

        // with toString() method
        /*
        By overriding the toString() method of the Object class, we can return
        values of the object, so we don't need to write much code.
         */
        Student2 martin = new Student2(002, "Martin Garixx", 22);
        System.out.println(martin);

    }

}

class Student{

    int id;
    String name;
    int age;

    public Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

}

class Student2 {

    int id;
    String name;
    int age;

    public Student2(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student2{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
