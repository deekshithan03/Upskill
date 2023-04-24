package day1.capg;

import java.util.Scanner;

// [10]program that takes an integer as input and prints whether it is a prime number or
//not. (Use a while loop)

public class PrimeNum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the integer:");
		int a = sc.nextInt();
		boolean bool = true;
		int i=2; 
		while(i<=a/2) {
			if(a%i==0) {
				bool=false;
				break;
			}i++;
		}	
		if(bool==false){
			System.out.println("not prime");
		}
		else
			System.out.println("prime");
	}

}
