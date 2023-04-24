package day1.capg;

import java.util.Scanner;

//[11]a program that takes an integer as input and prints the Fibonacci sequence up to that
//integer. (Use a while loop)
public class Fibo {

	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the integer:");
		int a = sc.nextInt();
		int i =1;
		int first = 0;
		int second=1;
		int result;
		while(i<=a) {
			System.out.println(first);
			result=first+second;
			first =second;
			second =result;
			i++;
		}
		
	}

}
