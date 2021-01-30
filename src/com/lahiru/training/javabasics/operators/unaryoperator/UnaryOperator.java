package com.lahiru.training.javabasics.operators.unaryoperator;

public class UnaryOperator {

    /*
    //// postfix
    exp++
    exp--


    //// prefix
    ++exp
    --exp
    ~
    !
     */


    /*
    The Java unary operators require only one operand. Unary operators are used to
    perform various operations i.e.:
        1. incrementing/decrementing a value by one
        2. negating an expression
        3. inverting the value of a boolean
     */

    public static void main(String[] args) {

        System.out.println("Post Fix");
        int x = 10;
        System.out.println(x++); // 10 (11)
        System.out.println(++x); // 12
        System.out.println(x--); // 12 (11)
        System.out.println(--x); // 10
        System.out.println();

        int a = 5;
        int b = 5;
        System.out.println(a++ /* 5(6) */ + ++a /* 7 */); // 12
        System.out.println(b++ /* 5(6) */ + b++ /* 6 */); // 11



        //// ~ and !
        int p = 10;
        int q = -10;
        boolean r = true;
        boolean s = false;
        System.out.println(~p); // -11 (minus of total positive value which starts from 0)
        System.out.println(~q); // 9 (positive of total minus, positive starts from 0)
        System.out.println(!r); // false (opposite of boolean value)
        System.out.println(!s); // true

    }

}
