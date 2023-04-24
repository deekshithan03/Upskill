package day1.capg;
//[3]  program that takes two integers as input and prints whether the first integer is

import java.util.Scanner;

//greater than, less than, or equal to the second integer.

public class GreaterOrLesser {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the first integer:");
		int a = sc.nextInt();
		System.out.println("Enter the second integer:");
		int b = sc.nextInt();
		if (a > b) {
			System.out.println(a + " is greater than " + b);
		} else if (a < b) {
			System.out.println(a + " is less than " + b);

		} else {
			System.out.println("Both are equal");
		}

	}

}
