package day2.capg;

//[13]	WAP to reverse the array 

import java.util.Scanner;

public class ResverseArray {

	public static void main(String[] args) {
		int[] a = new int[5];
		Scanner sc = new Scanner(System.in);
		System.out.println("enter 5 numbers:");
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		for (int i = a.length-1; i >=0 ; i--) {
			System.out.println(a[i]);
		}
	}
}
