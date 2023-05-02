package day5.capg;

import java.util.Scanner;
//to get smaller number using Predicate Functional Interface
import java.util.function.IntPredicate;

public class PredicateFuncInter {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter two nummber:");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		
		IntPredicate compareTwoNum = num -> num > n1;
		if(compareTwoNum.test(n2)) {
			System.out.println(n2+" is greater than "+n1); 
		}
		else
			System.out.println(n2+" is lesser than "+n1); 
	}
//	public static int smallerNumber(int num1, int num2) {
//		IntPredicate isSmaller = x -> x < num2;
//		if (isSmaller.test(num1)) {
//			return num1;
//		} else
//			return num2;
//	}
//
//	public static void main(String[] args) {
//		int small = smallerNumber(10, 20);
//		System.out.println(small);
//
//	}
}
