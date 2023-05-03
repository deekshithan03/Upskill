package day6.capg;

//Write a Java program that demonstrates the use of 
//thread priority and sleep() method to control thread execution.
class Animal implements Runnable {
	public void run() {
		for (int i = 1; i <= 10; i++) {
			System.out.println("Eating...");
		}
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {e.printStackTrace();}
	}
}
class Dog implements Runnable{
	public void run() {
		for (int i = 1; i <= 10; i++) {
			System.out.println("Dog eats");
		}
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {e.printStackTrace();}
	}
}

public class ThreadPriorityAndSleep {

	public static void main(String[] args) {
		Animal obj1 = new Animal();
		Dog obj2 = new Dog();
		Thread t1=new Thread(obj1);
		Thread t2=new Thread(obj2);
		t2.setPriority(Thread.MAX_PRIORITY);
		t1.start();
		t2.start();
	}

}
