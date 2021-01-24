package com.lahiru.training.javabasics.accessmodifiers.defaultmodifer.application;

import com.lahiru.training.javabasics.accessmodifiers.defaultmodifer.character.Character;


//  The access level of a default modifier is only within the package.
//  It cannot be accessed from outside the package. If you do not specify
//  any access level, it will be the default.
public class Application extends Character {

    public static void main(String[] args) {
        Character character = new Character();
//        System.out.println(character.level);
    }

}
