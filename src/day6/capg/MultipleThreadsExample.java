package day6.capg;

//creating thread using thread class
//Q: Write a Java program that creates multiple threads and starts them.

class A extends Thread {
	public void run() {
		for (int i = 1; i <= 5; i++) {
			System.out.println("Hi");
			try {
				Thread.sleep(10); // will throw InterruptedException so surround with try/catch
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class B extends Thread {
	public void run() {
		for (int i = 1; i <= 5; i++) {
			System.out.println("There");
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class MultipleThreadsExample {
	public static void main(String[] args) {
		A obj1 = new A();
		B obj2 = new B();
//		obj1.setPriority(Thread.MIN_PRIORITY);
		obj1.start();
		obj2.start();
	}

}
