package day6.capg;

//Write a Java program that uses multiple threads to calculate the sum of an array of integers.

import java.util.Arrays;
import java.util.Scanner;

public class Thread1 extends Thread {

	@Override
	public void run() {
		System.out.println("Enter the required size of the array : ");
		Scanner s = new Scanner(System.in);
		int size = s.nextInt();
		int[] myArray = new int[size];
		System.out.println("Enter the required quantity of the threads : ");
		int k = s.nextInt();
		int sum = 0;
		System.out.println("Enter the elements :");

		for (int i = 0; i < size; i++) {
			myArray[i] = s.nextInt();
		}
		for (int j = 0; j < k; j++) {
			sum = sum + myArray[j];
		}

		System.out.println("Elements of the array are: " + Arrays.toString(myArray));
		System.out.println("Sum of the elements of the array :" + sum);
		s.close();
	}

	public static void main(String[] args) {
		Thread1 t = new Thread1();
		t.start();
	}
}
