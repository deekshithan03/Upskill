package day6.capg;

//Write a Java program that reads input from the user and validates it using exception handling. 
//If the input is not valid, the program should throw an exception with a custom error message.

import java.util.Scanner;

class InvalidAgeException extends Exception {
	public InvalidAgeException(String str) {
		super(str);
	}
}

public class CustomException {
	public static void validateAge(int age) throws InvalidAgeException {
		if (age < 18) {
			throw new InvalidAgeException("not valid to vote");
		} else {
			System.out.println("vote");
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the age:");
		int age = sc.nextInt();
		try {
			validateAge(age);
		} catch (InvalidAgeException e) {
			System.out.println("exception caught");
			System.out.println(e.getMessage());
		}
		sc.close();

	}

}