package com.company;

import java.io.File;

public class Animal {
    public final String species;
    private Double weight;
    String name;
    File pic;

    public Animal(String species) {
        this.species = species;
        this.weight = weight;
        if (this.species == "Dog") {
            this.weight = 3.0;
        } else if (this.species == "Cat") {
            this.weight = 2.0;
        }
        ;
    }


    void feed() {

        if (this.weight > 0) {
            weight += 1;
            System.out.println("thanks my weight is now" + this.weight);
        } else {
            System.out.println("You can't feed dead pet");

        }
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

}
