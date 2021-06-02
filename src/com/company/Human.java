package com.company;

public class Human {
    String firstName;
    String lastName;
    String phone;
    private Double salary;
    Animal pet;
    Car car;

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


}
