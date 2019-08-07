package com.company;

import com.company.Builders.Builder;
import com.company.Builders.CarBuilder;
import com.company.Directors.CarDirector;
import com.company.Products.Car;

public class Main {

    public static void main(String[] args) {
        Builder builder = new CarBuilder();
        CarDirector.construct(builder);
        Car car = builder.getCar();
    }
}
