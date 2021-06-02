package com.company;

import com.company.devices.Car;
import com.company.devices.Phone;

public class Main {

	public static void main(String[] args) {
		Animal dog = new Animal("Dog");
		dog.name = "dog1";

		Phone Iphone = new Phone(4.5, "IOS", "Apple", "6.3/4", 2015);


		Human me = new Human();
		me.firstName = "Michal";
		me.lastName = "Konik";
		me.pet = dog;
		me.setSalary(1000.0);

		Car car1 = new Car(1000.0, "Seat", "Ibiza", 2020);
		Car car2 = new Car(1000.0, "Seat", "Ibiza", 2020);

		me.setCar(car1);
		me.cash = 100.0;

		Human jkm = new Human();
		jkm.firstName = "Janusz";
		jkm.lastName = "Korwin-Mikke";
		jkm.cash = 200.0;

		car1.sell(me, jkm, 2000.0);

		jkm.cash = 200000.0;

		car1.sell(me, jkm, 2000.0);

		System.out.println(car2.equals(car1));
		System.out.println(car2);
		System.out.println(car1);
		System.out.println(Iphone);
		System.out.println(dog);
		System.out.println(me);
		System.out.println(jkm);

	}
}
