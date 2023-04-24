package day1.capg;

import java.util.Scanner;

//[8] program that takes an integer as input and prints all the even numbers from 2 to
//that integer

public class ForLoopEven {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		for(int i=2;i<=a;i+=2) {
			System.out.println(i);
		}
	}

}
