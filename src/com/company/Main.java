package com.company;

public class Main {

	public static void main(String[] args) {
		Animal dog = new Animal();
		dog.name = "pies1";
		dog.Species = "dog";
		dog.weight = 8.0;
		dog.feed();

		Phone Iphone = new Phone();
		Iphone.Model = "65";
		Iphone.screenSize = 4.5;
		Iphone.OperationSystem = "IOS";

		Human me = new Human();
		me.firstName = "Michal";
		me.lastName = "Konik";
		me.pet = dog;

		System.out.println("nazwa zwierzecia to " + me.pet.name);

	}
}
