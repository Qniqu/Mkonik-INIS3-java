package com.company.devices;

import com.company.Human;

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

    @Override
    public void sell(Human seller, Human buyer, Double price) {
        if (seller.getCar() != this) {
            System.out.println("You can't sell phone that don't belong to you");
        }
        if (buyer.cash < price) {
            System.out.println("This phone is too expensive for buyer");
        }
        if (seller.getCar() == this && buyer.cash >= price) {
            buyer.cash -= price;
            seller.cash += price;
            buyer.buyCar(seller.getCar());
            seller.buyCar(null);
            System.out.println("Phone sold succesfully");
        }
    }
}
