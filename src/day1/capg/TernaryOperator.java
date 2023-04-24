package day1.capg;

import java.util.Scanner;

public class TernaryOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a:");
		int a = sc.nextInt();
		System.out.println("Enter b:");
		int b = sc.nextInt();
		System.out.println("Enter b:");
		int c = sc.nextInt();
		int result = a>b?(a>c? a:c):(b>c? b:c);
		System.out.println("Largest: "+result);
	}

}
