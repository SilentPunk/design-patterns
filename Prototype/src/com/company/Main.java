package com.company;

import com.company.concentrate.Hero;
import com.company.interfaces.IClonnable;

import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
	// lets create one default Hero
        var hero = new Hero();
        //we need more heroes

        var heroes = new HashSet<>();

        for (var i = 0 ; i < 30 ; i++){
            heroes.add(hero.cloneObject());
        }

        //different hash code for each
        heroes.forEach(iClonnable -> System.out.println(iClonnable.toString()));

        var newHero = new Hero (20, 20, 20, 20);
        for (var x = 0 ; x < 30 ; x++){
            heroes.add(newHero.cloneObject());
        }

        //different hash code for each
        heroes.forEach(iClonnable -> System.out.println(iClonnable.toString()));

    }
}
