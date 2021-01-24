package com.lahiru.training.javabasics.datatypes;

public class DataType {

    public static void main(String[] args) {

        byte x = 12;
        byte y = 15;
        byte z = (byte) (x + y);
        System.out.println("byte: " + z);

        short x1 = 12;
        short y1 = 15;
        short z1 = (short)(x1 + y1);
        System.out.println("short: " + z1);

        long x2 = 12;
        long y2 = 15;
        long z2 = x2 + y2;
        System.out.println("long: " + z2);

        int x3 = 12;
        int y3 = 15;
        int z3 = x3 + y3;
        System.out.println("int: " + z3);

    }

    /////// default values
    // byte, short, int = 0
    // long = 0L
    // float = 0.0f
    // double = 0.0d
    // char = '\u0000'
    // String (any object) = null
    // boolean = false

}


/*
Numeric Promotions

To execute a binary operation, it is necessary that both operands are compatible in terms of size.
There is a set of simple rules that apply:

1. If one of the operands is a double, the other is promoted to double
2. Otherwise, if one of the operands is a float, the other is promoted to float
3. Otherwise, if one of the operands is a long, the other is promoted to long
4. Otherwise, both are considered int

 */
