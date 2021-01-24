package com.lahiru.training.javabasics.keyword.statickeyword.staticblock;

import java.util.LinkedList;
import java.util.List;

// A static block is used for initializing static variables.
// Although static variables can be initialized directly during
// declaration, there are situations when we're required to do the multiline processing.
public class Role {

    // In this example, it wouldn't be possible to initialize List object
    // with all the initial values along with   declaration;
    // and that's why we've utilized the static block here.
    public static List<String> ranks = new LinkedList<String>();

    // If static variables require additional, multi-statement logic while
    // initialization, then a static block can be used

    // initialize a list object with some pre-defined values.
    static {
        ranks.add("Lieutenant");
        ranks.add("Captain");
        ranks.add("Major");
    }

    static {
        ranks.add("Colonel");
        ranks.add("General");
    }

    public static void main(String[] args) {
        System.out.println("for");
        for (int i=0; i<ranks.size(); i++){
            System.out.println(ranks.get(i));
        }

        System.out.println("**************");
        System.out.println("for-each");
        for(String rank: ranks){
            System.out.println(rank);
        }
    }

    // Reasons to Use static Blocks
    // 1. If initialization of static variables requires some additional logic except the assignment
    // 2. If the initialization of static variables is error-prone and requires exception handling

    // Key Points to Remember
    // 1. A class can have multiple static blocks
    // 2. static fields and static blocks are resolved and
    //    executed in the same order as they are present in the class

}
