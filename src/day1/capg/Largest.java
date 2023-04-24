package day1.capg;

import java.util.Scanner;

//[6] program that takes three integers as input and prints the largest one.

public class Largest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first integer:");
		int a = sc.nextInt();
		System.out.println("Enter the second integer:");
		int b = sc.nextInt();
		System.out.println("Enter the third integer:");
		int c = sc.nextInt();
		if(a>b && a>c) {
			System.out.println(a+" is the largest");
		}
		else if(b>a && b>c) {
			System.out.println(b+" is the largest");
		}
		else {
			System.out.println(c+" is the largest");
		}
	}

}
