package day1.capg;
//[1] a Java program to declare a variable of type String and assign it the value of "Hello
//World". Print the value of the variable.

import java.util.Scanner;

public class HelloWorld {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string:");
		String word = sc.nextLine();
		System.out.println(word);

	}

}
