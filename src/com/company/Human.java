package com.company;

import com.company.creatures.Animal;
import com.company.devices.Car;
import com.company.devices.Device;
import com.company.devices.Phone;

public class Human {
    String firstName;
    String lastName;
    public Double cash;
    private Double salary;
    public Animal pet;
    private static final Integer defaultGarageSize = 3;
    public Phone phone;
    String phoneNumber;
    Car[] garage;

    public Double getSalary() {
        if (salary != null) {
            System.out.println("Your salary is " + salary);
            return salary;
        } else {
            System.out.println("You don't have any salary - find job, take credit, move out or something");
            return null;
        }
    }

    public Human(String firstName, String lastName, Double cash) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.cash = cash;
        this.garage = new Car[defaultGarageSize];
    }

    public Human(String firstName, String lastName, Double cash, Integer garageSize) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.cash = cash;
        this.garage = new Car[garageSize];
    }

    public void setSalary(Double salary) {
        if (salary < 0) {
            System.out.println("You can't have negative salary");

        } else {
            System.out.println("New salary has been set and sent to account system");
            System.out.println("Remember you have to get annex to your contract from Mrs Hania");
            System.out.println("Data has been sent to ZUS and US");
            this.salary = salary;
        }
    }

    public Car getCar(Integer garageSlot) {
        return garage[garageSlot];
    }


    public void setCar(Car car) {
        if (car.value <= salary) {
            for (int i = 0; i < garage.length; i++) {
                if (garage[i] == null) {
                    garage[i] = car;
                    System.out.println("Place of your car have number " + i);
                    break;
                } else {
                    System.out.println("This garage don't have any more space");
                }
            }
        }
        if (car.value / 12 <= salary && car.value > salary) {
            System.out.println("You took credit and bought car");
            for (int i = 0; i < garage.length; i++) {
                if (garage[i] == null) {
                    garage[i] = car;
                    System.out.println("You took a car to the spot " + i);
                    break;
                } else {
                    System.out.println("This garage spot is already taken");
                }
            }
        }
        if (car.value / 12 > salary) {
            System.out.println("You are too poor to afford car");
        }
    }

    public Double garageValue(Device value) {
        Double sumValue = 0.0;
        for (Car car : garage) {
            sumValue += car.value;
        }
        return sumValue;
    }


    public String toString() {
        return firstName + " " + lastName + " " + phone + " " + salary + " " + pet;
    }
}
