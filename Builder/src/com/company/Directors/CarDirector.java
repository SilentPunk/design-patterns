package com.company.Directors;

import com.company.Builders.Builder;

public class CarDirector {

    public static void construct(Builder builder) {
        builder.buildCar()
                .setBrand("Volkswagen")
                .setPetrol("95/LPG")
                .setName("Golf");

    }


}
