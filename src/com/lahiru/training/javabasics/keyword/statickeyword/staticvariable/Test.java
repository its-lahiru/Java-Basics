package com.lahiru.training.javabasics.keyword.statickeyword.staticvariable;

public class Test {

    static int number = 10;
    int number1 = 20;

    public static void main(String[] args) {
        System.out.println(number);
        System.out.println(new Test().number1);

        Test test = new Test();
    }



}
