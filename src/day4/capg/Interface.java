package day4.capg;
//1[]interface
interface Animals{
	void eat();
}
interface Birds extends Animals{
	void fly();
}

class Cow implements Animals{
	public void eat() {
		System.out.println("Cow eats grass");
	}
}
class Tiger implements Animals{
	public void eat() {
		System.out.println("Tiger eats meat");
	}
}
class Penguin implements Animals,Birds{
	public void fly() {
		System.out.println("Penguins can't fly");
	}
	public void eat() {
		System.out.println("Penguins eat fishes");
	}
	
}

public class Interface {
 public static void main(String[] args) {
	 Animals obj = new Cow();
	 obj.eat();
	 Animals obj2 = new Tiger();
	 obj2.eat();
	 Birds obj3 = new Penguin();
	 obj3.fly();
	 obj3.eat();
 }
}
