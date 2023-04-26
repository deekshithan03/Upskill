package day4.capg;

import java.util.Arrays;

//Write a Java program to sort an ArrayList of strings using lambda expressions.

interface Fruits {
	int listOffruits(String a, String b);
}

public class LambdaSortingArray {
	public static void main(String[] args) {
		String[] fruit = {"banana", "apple", "orange","kiwi"};
		Fruits obj = (a,b) -> a.compareTo(b);
		Arrays.sort(fruit, obj::listOffruits);
		System.out.print(Arrays.toString(fruit));
		
	}

}