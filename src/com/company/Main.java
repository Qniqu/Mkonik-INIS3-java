package com.company;

public class Main {

	public static void main(String[] args) {
		Animal dog = new Animal("Dog");
		dog.name = "dog1";

		Phone Iphone = new Phone();
		Iphone.Model = "65";
		Iphone.screenSize = 4.5;
		Iphone.OperationSystem = "IOS";

		Human me = new Human();
		me.firstName = "Michal";
		me.lastName = "Konik";
		me.pet = dog;

		Car car1 = new Car("Ibiza", "Seat");


		me.car = car1;

	}
}
