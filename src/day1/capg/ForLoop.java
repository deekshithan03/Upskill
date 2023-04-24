package day1.capg;

import java.util.Scanner;

//[7]a program that takes an integer as input and prints all the numbers from 1 to that
//integer. (Use a for loop)

public class ForLoop {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		for (int i = 1; i <= a; i++) {
			System.out.println(i);
		}

	}

}
