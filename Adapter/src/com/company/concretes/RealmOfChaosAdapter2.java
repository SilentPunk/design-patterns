package com.company.concretes;

import com.company.interfaces.Authors;
import com.company.interfaces.Description;

public class RealmOfChaosAdapter2 implements Description, Authors {
    private Description description;
    private Authors authors;

    public RealmOfChaosAdapter2(Description description, Authors authors){
        this.description = description;
        this.authors = authors;
    }

    @Override
    public void showAuthors() {
        authors.showAuthors();
    }

    @Override
    public void showDescription() {
        this.showAuthors();
        description.showDescription();
    }
}
