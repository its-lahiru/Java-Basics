package com.lahiru.training.javabasics.conrolstructures.continuestructure;

import java.util.ArrayList;
import java.util.List;

// Simply put, continue means to skip the rest of the loop we're in.
public class ContinueStatement {

    public static void main(String[] args){

        String[] gamesIPlayed = new String[]{"World of Tanks", "PUBG", "COD MW Series", "Battlefield Series", "COD Mobile"};
        List<String> onlineGamesIPlayed = new ArrayList<>();

        // current iteration breaks when gamesIPlayed is equal to mentioned values
        for(int i=0; i<gamesIPlayed.length; i++){
            if (gamesIPlayed[i].equals("COD MW Series") || gamesIPlayed[i].equals("Battlefield Series")){
                continue;
            }
            onlineGamesIPlayed.add(gamesIPlayed[i]);
        }
        System.out.println(onlineGamesIPlayed);

    }

    // As we've seen here, break and continue can be handy when iterating,
    // though they can often be rewritten with return statements or other logic.

}
