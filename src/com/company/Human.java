package com.company;

import com.company.creatures.Animal;
import com.company.devices.Car;
import com.company.devices.Phone;

public class Human {
    String firstName;
    String lastName;
    public Double cash;
    private Double salary;
    public Animal pet;
    private Car car;
    public Phone phone;
    String phoneNumber;

    public Double getSalary() {
        if (salary != null) {
            System.out.println("Your salary is " + salary);
            return salary;
        } else {
            System.out.println("You don't have any salary - find job, take credit, move out or something");
            return null;
        }
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

    public Car getCar() {
        return car;
    }

    public void buyCar(Car car) {
        this.car = car;
    }


    public void setCar(Car car) {
        if (car.value <= salary) {
            this.car = car;
            System.out.println("You bought car");
        }
        if (car.value / 12 <= salary && car.value > salary) {
            this.car = car;
            System.out.println("You took credit and bought car");
        }
        if (car.value / 12 > salary) {
            System.out.println("You are too poor to afford car");
            this.car = null;
        }
    }

    public String toString() {
        return firstName + " " + lastName + " " + phone + " " + salary + " " + pet + " " + car;
    }
}
