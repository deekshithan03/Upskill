package day4.capg;

import java.util.Scanner;

//4. Write a Java program to implement a simple calculator using switch case and enums.

enum Calculator{
	Addition,Subtraction,Multiplication,Division
}

public class EnumerationCalc {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter first number:");
		int a = sc.nextInt();
		System.out.println("Enter second number:");
		int b = sc.nextInt();
		
		Calculator operation = Calculator.Multiplication;

		switch(operation) {
		
		case Addition:
			System.out.println("Addition:"+ (a+b));
			break;
		case Subtraction:
			System.out.println("Subtraction:"+ (a-b));
			break;
		case Multiplication:
			System.out.println("Multiplication:"+ (a*b));
			break;
		default:
			System.out.println("Division:"+ (a/b));
			break;
		}
		
	}

}
