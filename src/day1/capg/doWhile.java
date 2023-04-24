package day1.capg;

import java.util.Scanner;

//[12]program that takes an integer as input and prints the sum of all the numbers from 1
//to that integer. (Use a do-while loop)
//Input-3
//Output-1,2,3 = 6

public class doWhile {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the integer:");
		int a = sc.nextInt();
		int i = 1;
		int sum=0;
		do {
			System.out.println(i);
			sum+=i;
			i++;
		} while (i <= a);
		System.out.println("=" +sum);
	}

}
