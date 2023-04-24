package day1.capg;

import java.util.Scanner;

//[4] program that takes an integer as input and prints whether it is even or odd.

public class EvenOdd {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the integer:");
		int a = sc.nextInt();
		if(a%2==0) {
			System.out.println(a+ " is even");
		}
		else {
			System.out.println(a+" is odd");
		}
		int b =22;  //ternary
		String result = b%2==0? "even":"odd";
		System.out.println(result);
	}

}
