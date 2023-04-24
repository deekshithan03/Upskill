package day2.capg;
//[1]
 class Demo {
	//change in no. of parameters
	public static int add(int a,int b) {
		return a+b;
	}
	public static int add(int m,int n,int o) {
		return m+n+o;
	}
	//change in datatype type of parameters
	public static double mul(double a,double b) {
		return a*b;
	}
	public static int mul(int a,int b) {
		return a*b;
	}
}
   public class MethodOverloading{
	public static void main(String[] args) {
		System.out.println(Demo.add(3, 4));
		System.out.println(Demo.add(3,4,5));
		System.out.println(Demo.mul(3.1,4.3));
		System.out.println(Demo.mul(8,4));
	}

}
