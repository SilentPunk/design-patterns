package com.company.concentrate;

import com.company.interfaces.IClonnable;

public class Hero implements IClonnable {

    private int str = 10;
    private int dex = 20;
    private int mana = 30;
    private int health = 30;

    public Hero(){

    }

    public Hero(Hero hero){
        this.str = hero.str;
        this.dex = hero.dex;
        this.mana = hero.mana;
        this.health = hero.health;
    }

    public Hero(int str, int dex, int mana, int health){
        this.str = str;
        this.dex = dex;
        this.mana = mana;
        this.health = health;
    }



    @Override
    public IClonnable cloneObject() {
        return new Hero(this);
    }

    public int getStr() {
        return str;
    }

    public void setStr(int str) {
        this.str = str;
    }

    public int getDex() {
        return dex;
    }

    public void setDex(int dex) {
        this.dex = dex;
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }
}
