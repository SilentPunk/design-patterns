package com.company;

import com.company.concretes.RealmOfChaosAdapter;
import com.company.concretes.RealmOfChaosAdapter2;
import com.company.concretes.RealmOfChaosAlbumAuthors;
import com.company.concretes.RealmOfChaosDescription;

public class Main {

    public static void main(String[] args) {
        // First adapter - based on extending class and implements Description interface
	  new RealmOfChaosAdapter(new RealmOfChaosDescription()).showDescription();

	  // Second adapter - based on implementation Description and Authors interface (in original we should use multi-inheritance but in jave we don't have such mechanism
	  new RealmOfChaosAdapter2(new RealmOfChaosDescription(), new RealmOfChaosAlbumAuthors())
              .showDescription();


    }
}
