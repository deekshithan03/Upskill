package day6.capg;

class Demo1 extends Thread{
	public void run() {
		for(int i=1;i<=5;i++) {
			System.out.println("Hi:"+i);
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
public class ThreadExamp {

	public static void main(String[] args) {

		Demo1 obj = new Demo1();
		obj.start();
		try {
			Thread.sleep(3000);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		obj.stop(); //stops after 3 seconds 
	}

}
