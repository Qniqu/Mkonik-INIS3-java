package com.company.devices;

public class Phone {
    String Producer;
    String Model;
    Double screenSize;
    String OperationSystem;

    public Phone(String Model, Double screenSize, String operationSystem) {
        this.Model = Model;
        this.screenSize = screenSize;
        this.OperationSystem = operationSystem;

    }


    public String toString() {
        return Model + " " + Producer + " " + screenSize + " " + OperationSystem;
    }
}
