package com.company.Builders;

import com.company.Products.Car;

public interface Builder {
    public Builder buildCar();
    public Builder setBrand(String brand);
    public Builder setPetrol(String petrol);
    public Builder setName(String name);
    public Car getCar();
}
