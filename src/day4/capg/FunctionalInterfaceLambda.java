package day4.capg;
//functional interface and lambda expression

@FunctionalInterface   //has only one abstract method
interface Test{
	int add(int a,int b);
}

public class FunctionalInterfaceLambda {

	public static void main(String[] args) {
//	Test obj = new Test() {
//		
//		public int add(int a, int b) {
//			return a+b;
//		}
//	};
		Test obj =  (a, b)->  a+b;
		
	int result = obj.add(5, 2);
	System.out.println(result);

	}

}
