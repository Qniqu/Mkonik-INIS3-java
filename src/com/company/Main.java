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
		Human me = new Human("Michal", "Konik", 1000.0);
		me.setSalary(1000.0);
		me.pet = dog1;

		Car car1 = new Diesel(1000.0, "Seat", "Ibiza", 2020);
		Car car2 = new Electric(1000.0, "Seat", "NeoIbiza", 2020);

		Human jkm = new Human("Janusz", "Korwin-Mikke", 20000.0, 4);

		car1.sell(me, jkm, 2000.0);

		jkm.cash = 200000.0;

		car1.sell(me, jkm, 2000.0);


	}
}
