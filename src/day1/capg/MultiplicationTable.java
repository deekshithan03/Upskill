package day1.capg;

import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the integer:");
		int a= sc.nextInt();
		int result;
		for(int i =1; i<=10;i++) {
			result=(a * i);
			System.out.println(a+" * "+i+" = "+ result);
		}
				
	}

}
