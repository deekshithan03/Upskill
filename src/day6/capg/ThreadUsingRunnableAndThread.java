package day6.capg;

//Write a Java program that uses both Runnable and Thread to create and start a thread.
class Abc extends Thread{
	public void run() {
		for (int i = 1; i <= 10; i++) {
			System.out.println("Thread running using thread class");
		}
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {e.printStackTrace();}
	}
}
class Xyz implements Runnable{
	public void run() {
		for (int i = 1; i <= 10; i++) {
			System.out.println("Thread using Runnable");
		}
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {e.printStackTrace();}
	}
}
public class ThreadUsingRunnableAndThread {

	public static void main(String[] args) {
		Abc obj = new Abc();
		Xyz obj1 = new Xyz();   //passing the obj to thread constructor
		Thread t1= new Thread(obj1);
		obj.start();
		t1.start();
	}

}
