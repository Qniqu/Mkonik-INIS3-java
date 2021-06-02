package com.company;

import com.company.creatures.Pet;
import com.company.devices.Car;
import com.company.devices.Diesel;
import com.company.devices.Electric;
import com.company.devices.Phone;

public class Main {

	public static void main(String[] args) {


		Phone Iphone = new Phone(4.5, "IOS", "Apple", "6.3/4", 2015);

		Pet dog1 = new Pet("Dog", 3.0, "dog1");
		Human me = new Human();
		me.firstName = "Michal";
		me.lastName = "Konik";
		me.setSalary(1000.0);
		me.pet = dog1;

		Car car1 = new Diesel(1000.0, "Seat", "Ibiza", 2020);
		Car car2 = new Electric(1000.0, "Seat", "NeoIbiza", 2020);

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
		System.out.println(me);
		System.out.println(dog1);
		System.out.println(jkm);

		dog1.sell(me, jkm, 2000.0);

		System.out.println(jkm);
		dog1.feed();
		dog1.feed(10.0);

		car1.refuel();
		car2.refuel();

		Iphone.installAnApp("niceApp", 1.12);

	}
}
