package inheritance.capg;

public class InheritanceDemo {

	public static void main(String[] args) {

		MountainBike mbike = new MountainBike(20, 10, 1);
		System.out.println("Gear is:"+ mbike.gear);
		System.out.println("Speed is:"+ mbike.speed);
		System.out.println("Height is:"+ mbike.height);
		mbike.applyBrake(1);      //method in base class
		System.out.println("Speed after applying brake:"+ mbike.speed);
		mbike.speedUp(2);
		System.out.println("Speed after applying brake:"+ mbike.speed);

	}

}
