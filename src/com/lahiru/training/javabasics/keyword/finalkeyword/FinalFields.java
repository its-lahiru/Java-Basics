package com.lahiru.training.javabasics.keyword.finalkeyword;

public class FinalFields {

    static final int MAX_WIDTH = 999;
    final int MAX_LENGTH = 999;

    public static void main(String[] args) {
        System.out.println(MAX_WIDTH);

        System.out.println(new FinalFields().MAX_LENGTH);
    }

}
