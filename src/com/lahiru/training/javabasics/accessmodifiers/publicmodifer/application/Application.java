package com.lahiru.training.javabasics.accessmodifiers.publicmodifer.application;

import com.lahiru.training.javabasics.accessmodifiers.publicmodifer.enemy.Enemy;
import com.lahiru.training.javabasics.accessmodifiers.publicmodifer.hero.Hero;

// The access level of a public modifier is everywhere. It can be accessed
// from within the class, outside the class, within the package and outside the package.
public class Application {

    public static void main(String[] args) {

        Enemy enemy = new Enemy();
        Hero hero = new Hero();

        System.out.println(enemy.health);
        System.out.println(hero.health);

    }

}
