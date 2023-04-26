package day4.capg;

//Write a sample Java program that demonstrates the use of upcasting & downcasting.
class Car {
	public void wheeler() {
		System.out.println("Car has 4 wheels");
	}

	public void brand() {
		System.out.println("Car has many brands");
	}

}	

class Kia extends Car {
	@Override
	public void wheeler() {
		System.out.println("Kia has 4 wheels");
	}

	public void model() {
		System.out.println("Sonet");
	}
}

public class Casting {

	public static void main(String[] args) {
		Car obj = new Kia(); // upcasting
		obj.wheeler();
		obj.brand();
		Kia obj1 = (Kia) obj; // downcasting
		obj1.model();
		// ((Kia)obj).model();
	}

}
