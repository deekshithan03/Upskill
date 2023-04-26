package day4.capg;

class Abc {
	public void classA() {
		System.out.println("A class");
	}
}

public class AnonymousInnerClass {

	public static void main(String[] args) {
     Abc obj = new Abc() {
    	 public void classA() {
    		 System.out.println("New class that overrides");
    	 }
     };
     obj.classA();
	}
}
