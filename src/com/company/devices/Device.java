package com.company.devices;

import com.company.sellable;

public abstract class Device implements sellable {
    final String producer;
    final String model;
    final int yearOfProduction;


    public Device(String producer, String model, int yearOfProduction) {
        this.producer = producer;
        this.model = model;
        this.yearOfProduction = yearOfProduction;
    }

    public String toString() {
        return model + " " + producer + " " + yearOfProduction;
    }

    public abstract void TurnOn();


}
