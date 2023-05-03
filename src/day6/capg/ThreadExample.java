package day6.capg;

//Write a Java program that creates a Thread and starts it.

class Example extends Thread {
	public void run() {
		for (int i = 1; i <= 5; i++) {
			System.out.println("Hi!");
		}
	}
}

public class ThreadExample {

	public static void main(String[] args) {
		Example obj = new Example();
		obj.start();
	}

}
