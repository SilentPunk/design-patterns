package com.company.concretes;

import com.company.interfaces.Authors;

public class RealmOfChaosAlbumAuthors implements Authors {

    @Override
    public void showAuthors() {
        System.out.println("Bolt Thrower");
    }
}
