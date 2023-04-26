package day4.capg;
//Write a Java program to handle a divide-by-zero exception.

public class ExceptionDivByZero {

	public static void main(String[] args) {
		int a=5;
		int b=0;
		int c = 0;
		try {
			c = a/b;
			if(c==0)
				throw new ArithmeticException("Don't divide by number greater than 5");
		}
		catch(ArithmeticException e) {
			System.out.println(e);
		}
		
		System.out.println(c);
	}

}
