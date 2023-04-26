package day4.capg;

import java.util.Arrays;

//Write a Java program to filter an ArrayList of integers using lambda expressions.

interface Numbers{
	boolean even(int a);
}
public class LambdaFilterInt {

	public static void main(String[] args) {
		int[] num = {1,2,3,4,5,6,7,8};
		Numbers obj = a-> a % 2==0;
		int[] evenNum=Arrays.stream(num)
				            .filter(obj::even)
				            .toArray();
		System.out.println(Arrays.toString(evenNum));
	}

}
