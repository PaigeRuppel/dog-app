package week2.oop.dogs;

public class Dog {

	String name; // defaults to null
	int numberOfLegs = 4; //setting a default (remove the value and see what prints out above ("0"))
	
	void rename(String newName) {
		//could have done this:
		// this.name = newName;
		name = newName;
	}

	void speak() {
		bark();
		System.out.println("Ruff, my name is " + name); // name is same as this.name
	}
	
	void bark() {
		System.out.println("Wrrfff!!");
	}
}
