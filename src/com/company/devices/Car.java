package com.company.devices;

public class Car extends Device {

    public Double value;
    boolean on;

    public Car(Double value, String producer, String model, int yearOfProduction) {
        super(producer, model, yearOfProduction);
        this.value = value;
    }

    @Override
    public void TurnOn() {
        on = true;
        System.out.println("Your car is on");
    }
}
