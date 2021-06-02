package com.company;

import com.company.devices.Car;
import com.company.devices.Phone;

public class Main {

	public static void main(String[] args) {
		Animal dog = new Animal("Dog");
		dog.name = "dog1";

		Phone Iphone = new Phone("65", 4.5, "IOS");


		Human me = new Human();
		me.firstName = "Michal";
		me.lastName = "Konik";
		me.pet = dog;
		me.setSalary(1000.0);

		Car car1 = new Car("Ibiza", "Seat", 1000.0);
		Car car2 = new Car("Ibiza", "Seat", 1000.0);

		me.setCar(car1);

		System.out.println(car2.equals(car1));
		System.out.println(car2);
		System.out.println(car1);
		System.out.println(Iphone);
		System.out.println(dog);
		System.out.println(me);

	}
}
