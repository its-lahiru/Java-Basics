package com.lahiru.training.javabasics.autoboxingandunboxing;

import java.math.BigDecimal;

public class AutoboxingAndUnboxing {

    public static void main(String[] args) {

        BigDecimal bigDecimal = new BigDecimal(12.23);
        System.out.println(bigDecimal);

        int a = 5; // primitive datatype

        // In here under the hood Integer.valueOf() method is calling
        Integer b = 5; // wrapper classes

        Integer c = 12;
        // In here under the hood integer.intValue() method is calling
        int d = c.intValue(); // boxing or wrapping


        // parseInt is a static method. so, we need to call with class. (Integer.parseInt)
        String e = "1234";
        int f = Integer.parseInt(e);
        System.out.println("result: " + (f + 1));

        Integer newInteger = Integer.valueOf(12);
        System.out.println(newInteger);

    }


}
