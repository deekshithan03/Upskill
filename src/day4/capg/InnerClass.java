package day4.capg;


class A{
	public void fly() {
		System.out.println("Flying");
	}
	
	 class B{ //inner class
		public void bclass() {
			System.out.println("B");
		}
	}
	static class C{   //static inner class
		public void cClass() {
			System.out.println("C");
		}
	}
}
public class InnerClass {

	public static void main(String[] args) {

		A obj = new A();
		obj.fly();
		A.B obj1 = obj.new B();
		obj1.bclass();
	
		A.C obj2= new A.C();
		obj2.cClass();
	}

}
