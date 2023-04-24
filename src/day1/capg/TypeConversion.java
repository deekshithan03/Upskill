package day1.capg;
//[2] Java program to convert an integer to a string,
//Write a Java program to convert a string to an integer,
//Write a Java program to convert a double to an integer,
//Write a Java program to convert a string to a double
public class TypeConversion {

	public static void main(String[] args) {
		//int->string
		int a =56;
		String ab =Integer.toString(a);
		System.out.println(ab);
		
		//string->int
		String x ="29";
		int y = Integer.parseInt(x);
		System.out.println(y);
		
		//double->int
		double d = 5.6;
		int i = (int)d;
		System.out.println(i);
		
		//string-> double
		String s ="34.5";
		double t = Double.parseDouble(s);
		System.out.println(t);
	}

}
