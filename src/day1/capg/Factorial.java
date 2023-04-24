package day1.capg;

import java.util.Scanner;

// [9] program that takes an integer as input and prints the factorial of that integer. (Use a
//for loop)
public class Factorial {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the integer:");
		int a = sc.nextInt();
		int fact =1;
		for(int i=1;i<=a;i++) {
			fact*=i;
		}
		System.out.println(fact);

	}

}
