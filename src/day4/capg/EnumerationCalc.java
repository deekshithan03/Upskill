package day4.capg;

import java.util.Scanner;

//4. Write a Java program to implement a simple calculator using switch case and enums.

enum Calculator{
	ADDITION,SUBTRACTION,MULTIPLICATION,DIVISION
}

public class EnumerationCalc {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter first number:");
		int a = sc.nextInt();
		System.out.println("Enter second number:");
		int b = sc.nextInt();
		
		Calculator operation = Calculator.MULTIPLICATION;

		switch(operation) {
		
		case ADDITION:
			System.out.println(operation+":"+ (a+b));
			break;
		case SUBTRACTION:
			System.out.println(operation+":"+ (a-b));
			break;
		case MULTIPLICATION:
			System.out.println(operation+":"+ (a*b));
			break;
		default:
			System.out.println(operation+":"+ (a/b));
			break;
		}
		
	}

}
