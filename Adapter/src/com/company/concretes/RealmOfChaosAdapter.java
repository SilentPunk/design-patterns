package com.company.concretes;

import com.company.interfaces.Authors;
import com.company.interfaces.Description;

public class RealmOfChaosAdapter extends RealmOfChaosAlbumAuthors implements Description {
    private Description description;

    public RealmOfChaosAdapter(Description description){
        this.description = description;
    }

    @Override
    public void showDescription() {
        super.showAuthors();
        description.showDescription();
    }
}
