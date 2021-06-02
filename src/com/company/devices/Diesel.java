package com.company.devices;

public class Diesel extends Car {
    public Diesel(Double value, String producer, String model, int yearOfProduction) {
        super(value, producer, model, yearOfProduction);
    }

    @Override
    public void refuel() {
        System.out.println("your car has been refueled");
    }
}
