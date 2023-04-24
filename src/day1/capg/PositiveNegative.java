package day1.capg;

import java.util.Scanner;

//[5] program that takes an integer as input and prints whether it is positive, negative, or
//zero.

public class PositiveNegative {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the integer:");
		int x = sc.nextInt();
		if(x==0) {
			System.out.println("Zero");
		}
		else if(x>0) {
			System.out.println("Positive integer");
		}
		else {
			System.out.println("Negative integer");
		}
		sc.close();
	}

}
