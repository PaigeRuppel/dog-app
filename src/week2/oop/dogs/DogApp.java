package week2.oop.dogs;

import java.util.Scanner;

public class DogApp {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		Dog firstDog = new Dog();
		writeLine("My dog is " + firstDog);

		// doesn't know her name yet
		writeLine("Her name is " + firstDog.name);

		firstDog.name = "Fido";
		writeLine("Her name is " + firstDog.name);

		// doesn't know number of legs (unless we set a default value for number
		// of legs)
		// writeLine(fido.name + " has " + fido.numberOfLegs + " legs");

		firstDog.numberOfLegs = 3;
		writeLine(firstDog.name + " has " + firstDog.numberOfLegs + " legs");

		// fido runs away and ends up in a shelter for 3-legged dogs
		// When fido gets adopted...

		firstDog.rename("Hope");
		writeLine("Her name is now " + firstDog.name);

		writeLine("Telling her to speak:");
		firstDog.speak();

		writeLine("Telling her to bark:");
		firstDog.bark();

		Dog myOtherDog = new Dog();
		myOtherDog.name = "Krusty";

		writeLine("My other dog's name is " + myOtherDog.name);
		myOtherDog.speak();

		writeLine("You come home. Your dogs act as if you've been gone for sooo long");
		Dog[] myDogs = { firstDog, myOtherDog };

		// could have: for (int i = 0; i < myDogs.length; i++) {
		for (Dog currentDog : myDogs) {
			currentDog.speak();
		}
		
		input.close();

	} // closing bracket for main

	public static void writeLine(String message) {
		System.out.println(message);
	}

}
