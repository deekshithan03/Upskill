package day1.capg;

import java.util.Scanner;

//[13]a program that takes a string as input and prints the reverse of that string. (Use a for
//loop)
public class ReverseStr {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the string to be reversed:");
		String word =sc.nextLine();
		for (int i = word.length()-1; i >= 0; i--) {
			System.out.print(word.charAt(i));
		}

	}

}
   