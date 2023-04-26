package day3.capg;
//super() is present by default, only when we want to make changes we can use super.
//eg calling parameterized super class constructor

class A{
	public A() {
		System.out.println("Constructor A");
	}
	public A(int a) {
		this();                       //this() is used to call the constructor of same class
		System.out.println("int A");
	}
}
class B extends A{
	public B() {
		super(5);                     //super() is used to call the constructor of super class
		System.out.println("Constructor B");
	}
	public B(int b) {
		this();
		System.out.println("int B");
	}
}
public class Constructor1 {

	public static void main(String[] args) {

		new B(10);         //anonymous object, not assigned to any ref var
	}

}
