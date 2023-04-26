package day3.capg;
//Inheritance

//Create a class named "Animal" with a method named "speak" that prints a message. 
//Create a subclass named "Dog" that overrides the "speak" method to print "Woof!". 
//Create an instance of the Dog class and call the speak method.

class Animal {
	public void speak() {
		System.out.println("Animals can't speak");
	}
}

class Dog extends Animal{
	public void speak() {
		super.speak();    //to invoke super class speak method
		System.out.println("Woof!");
	}
}

public class Inheritance {

	public static void main(String[] args) {
		
	 Dog dog = new Dog();
	 dog.speak();
	 
	 
	 //dynamic method dispatch
	 System.out.println("dynamic method dispatch");
	 Animal obj = new Animal();
	 obj.speak();
	 obj= new Dog();
	 obj.speak();
	}

}
