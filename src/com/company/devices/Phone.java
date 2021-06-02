package com.company.devices;

public class Phone extends Device {
    Double screenSize;
    String OperationSystem;
    boolean on;

    public Phone(Double screenSize, String operationSystem, String producer, String model, int yearOfProduction) {
        super(producer, model, yearOfProduction);
        this.screenSize = screenSize;
        this.OperationSystem = operationSystem;

    }

    @Override
    public void TurnOn() {
        on = true;
        System.out.println("Welcome user");
    }
}
