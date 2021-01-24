package com.lahiru.training.javabasics.classvsinterface.abstractclass;

//Some examples of abstract classes from the JDK are AbstractMap and AbstractList.
abstract class PlayGame {

    public abstract void run();

    public void upgrade(){
        System.out.println("upgrade game");
    }

}

/*Note
 abstract classes can't be instantiated, only subclassed. other classes extend abstract classes.
 */
