package com.company.devices;

public class Car {

    final String model;
    final String producer;
    public Double value;

    public Car(String model, String producer, Double value) {
        this.model = model;
        this.producer = producer;
        this.value = value;
    }

    public String toString() {
        return model + " " + producer + " " + value;
    }

}
