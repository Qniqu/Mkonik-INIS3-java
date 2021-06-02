package com.company.devices;

import com.company.Human;

import java.net.URL;

public class Phone extends Device {
    Double screenSize;
    String OperationSystem;
    boolean on;
    private static final String default_version = "2.13.7";
    private static final String default_protocol = "2137";
    private static final String default_URL = "https://www.example.com/";
    private String[] listOfApps;
    private String nameOfApp;
    private Double version;
    private String adress;

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

    public void installAnApp(String nameOfApp) {
        this.nameOfApp = nameOfApp;
    }

    public void installAnApp(String nameOfApp, Double version) {
        this.nameOfApp = nameOfApp;
        this.version = version;
        System.out.println("Instalation of " + nameOfApp + version + " succesfull");
    }

    public void installAnApp(String nameOfApp, Double version, String adress) {
        this.nameOfApp = nameOfApp;
        this.version = version;
        this.adress = adress;
    }

    public void installAnApp(String[] listOfApps) {
        this.listOfApps = listOfApps;
    }

    public void installAnApp(URL URLofApp) {

    }


}
