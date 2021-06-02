package com.company.devices;

import com.company.sellable;

public abstract class Device implements sellable {
    final String producer;
    final String model;
    final int yearOfProduction;
    public Double value;

    public Device(String producer, String model, int yearOfProduction, Double value) {
        this.producer = producer;
        this.model = model;
        this.yearOfProduction = yearOfProduction;
    }

    public String toString() {
        return model + " " + producer + " " + yearOfProduction;
    }

    public abstract void TurnOn();


}
