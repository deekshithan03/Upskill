package day5.capg;

import java.util.Scanner;

@FunctionalInterface
interface Addition {
	int add(int a, int b);
}

public class LambdaFuncInterface {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number:");
		int n1 = sc.nextInt();
		System.out.println("Enter second number:");
		int n2 = sc.nextInt();
		Addition obj = (a, b) -> a + b;
		int result = obj.add(n1, n2);
		System.out.println("Addition:" + result);
	}

}
