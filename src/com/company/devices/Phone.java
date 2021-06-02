package com.company.devices;

import com.company.Human;

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

    @Override
    public void sell(Human seller, Human buyer, Double price) {
        if (seller.phone != this) {
            System.out.println("You can't sell phone that don't belong to you");
        }
        if (buyer.cash < price) {
            System.out.println("This phone is too expensive for buyer");
        }
        if (seller.phone == this && buyer.cash >= price) {
            buyer.cash -= price;
            seller.cash += price;
            buyer.phone = seller.phone;
            seller.phone = null;
            System.out.println("Phone sold succesfully");
        }
    }
}
