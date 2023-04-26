package day4.capg;

abstract class Animal {
	public abstract void eat(); // abstract method declaration

	public void speak() {
		System.out.println("Animals can't speak");
	}
}

class Dog extends Animal {

	public void eat() { // method implementation
		System.out.println("Dog eats");
	}

}

public class AbstractClass {

	public static void main(String[] args) {

		Animal dog = new Dog(); // cannot instantiate abstract class
		dog.eat();
		dog.speak();
	}

}
