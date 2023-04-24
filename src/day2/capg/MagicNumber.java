package day2.capg;

import java.util.Scanner;

//magic number - sum of all digits till single digit must be 1. 1234-1+2+3+4=10=1+0=1
public class MagicNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int a = sc.nextInt();
		int rem;
		int sum = 0;
		int temp = a;
		while (temp > 9) {
			while (temp > 0) {
				rem = temp % 10;
				sum = sum + rem;
				temp = temp / 10;
			}
			temp =sum;
			sum=0;
		}

		if (temp == 1) {
			System.out.println("Magic number");
		} else {
			System.out.println("Not a magic number");
		}
	}

}
