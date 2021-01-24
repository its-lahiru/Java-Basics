package com.lahiru.training.javabasics.keyword.statickeyword.staticclass;

// The nested class architecture is divided into two
// 1. nested classes that are declared static are called static nested classes
// 2. nested classes that are non-static are called inner classes

// The main difference between these two is that the inner classes have access
// to all member of the enclosing class (including private),
// whereas the static nested classes only have access to static members of the outer class.
public class Singleton {

    private Singleton() {
    }

    // static nested classes behaved exactly like any other top-level
    // class but enclosed in the only class which will access it,
    // to provide better packaging convenience
    private static class SingletonHolder {
        public static final Singleton SINGLETON_INSTANCE = new Singleton();
    }

    // The most widely used approach to create singleton objects is through
    // static nested class is it doesn't require any synchronization
    // and is easy to learn and implement
    public static Singleton getInstance() {
        return SingletonHolder.SINGLETON_INSTANCE;
    }

    // Reasons to Use a static Inner Class
    // 1. Grouping classes that will be used only in one place increases encapsulation
    // 2. The code is brought closer to the place that will be only one to use it;
    //    this increases readability and code is more maintainable
    // 3. If nested class doesn't require any access to it's enclosing class instance members,
    //    then it's better to declare it as static because this way, it won't be coupled
    //    to the outer class and hence will be more optimal as they won't require any heap or stack memory


    // Key Points to Remember
    // 1. static nested classes do not have access to any instance members(methods/variables) of the
    //    enclosing outer class; it can only access them through an object's reference
    // 2. static nested classes can access all static members of the enclosing class,
    //    including private ones
    // 3. Java programming specification doesn't allow us to declare the top-level class as static;
    //    only classes within the classes (nested classes) can be made as static
}
