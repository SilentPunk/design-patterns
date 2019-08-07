package com.company.Builders;

import com.company.Products.Car;

public class CarBuilder implements Builder {
    private Car car;

    @Override
    public Builder buildCar() {
        this.car = new Car();
        return this;
    }

    @Override
    public Builder setBrand(String brand) {
        this.car.setBrand(brand);
        return this;
    }

    @Override
    public Builder setPetrol(String petrol) {
        this.car.setPetrol(petrol);
        return this;
    }

    @Override
    public Builder setName(String name) {
        this.car.setName(name);
        return this;
    }

    @Override
    public Car getCar(){
        return this.car;
    }
}
