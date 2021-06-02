package com.company.devices;

public class LPG extends Car {
    public LPG(Double value, String producer, String model, int yearOfProduction) {
        super(value, producer, model, yearOfProduction);
    }

    @Override
    public void refuel() {
        System.out.println("your car has been refueled");
    }
}
