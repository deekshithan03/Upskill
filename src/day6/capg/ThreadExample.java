package day6.capg;

//Write a Java program that creates a Thread and starts it.

class Example extends Thread {
	public void run() { //run() method gets the thread running
		for (int i = 1; i <= 5; i++) {
			System.out.println("Hi!");
		}
	}
}

public class ThreadExample {

	public static void main(String[] args) {
		Example obj = new Example();
		obj.start(); //start() method makes the thread ready to run and executes run()
	}

}
