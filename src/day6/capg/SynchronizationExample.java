package day6.capg;
//Write a Java program that demonstrates the use of synchronization to prevent race
//conditions between multiple threads accessing a shared resource.

class Count {
	int count;
	public synchronized void increment() {
		count++;
	}
}

public class SynchronizationExample {

	public static void main(String[] args) {
		Count c = new Count();
		Runnable obj1 = ()-> {
			for(int i=1;i<=100;i++) {
				c.increment();
			}
		};
		Runnable obj2 = ()-> {
			for(int i=1;i<=100;i++) {
				c.increment();
			}
		};
		Thread t1 = new Thread(obj1);
		Thread t2 = new Thread(obj2);
		t1.start();
		t2.start();
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(c.count);
	}

}

