package day1.capg;

import java.util.Scanner;

public class PrimeNum1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a:");
		int a = sc.nextInt();
		System.out.println("Enter b:");
		int b = sc.nextInt();
		for (int i = a; i <= b; i++) {
			boolean bool = true;

			if (i <= 1) {
				bool = false;
			}
			for (int j = 2; j <= Math.sqrt(i); j++) {
				if (i % j == 0) {
					bool = false;
					break;
				}
			}
			if (bool) {
				System.out.println(i + " ");
			}
		}

		// using while loop
		while (a <= b) {
			boolean isPrime = true;
			int i = 2;
			while (i <= a / 2) {
				if (a % i == 0) {
					isPrime = false;
					break;
				}
				i++;
			}
			if (isPrime && a != 1) {
				System.out.println("Whileloop" +a);
			}
			a++;
		}
	}
}
