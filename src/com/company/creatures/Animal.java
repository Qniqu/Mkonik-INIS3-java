package com.company.creatures;

import com.company.Human;
import com.company.sellable;

import java.io.File;

public abstract class Animal implements sellable, Feedable {
    public final String species;
    private Double weight;
    String name;
    File pic;

    public Animal(String species, Double weight, String name) {
        this.species = species;
        this.name = name;
        this.weight = weight;
    }




    void takeForAWalk() {
        if (this.weight > 0) {
            weight -= 1;
            System.out.println("woof, my weight is now" + this.weight);
        } else {
            System.out.println("This is the end, beautiful friend\n" +
                    "This is the end, my only friend\n" +
                    "The end of our elaborate plans\n" +
                    "The end of everything that stands\n" +
                    "The end");

        }

    }

    public String toString() {
        return species + " " + weight + " " + name;
    }

    @Override
    public void sell(Human seller, Human buyer, Double price) {
        if (seller.pet != this) {
            System.out.println("You can't sell pet that don't belong to you");
        }
        if (buyer.cash < price) {
            System.out.println("This pet is too expensive for buyer");
        }
        if (seller.pet == this && buyer.cash >= price) {
            buyer.cash -= price;
            seller.cash += price;
            buyer.pet = seller.pet;
            seller.pet = null;
            System.out.println("Pet sold succesfully");
        }
    }

    @Override
    public void feed() {
        System.out.println("you fed your animal");
    }

    @Override
    public void feed(Double foodWeight) {
        System.out.println("you fed " + foodWeight + " to your animal");
    }
}
