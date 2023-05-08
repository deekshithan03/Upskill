package string.manipulation;

import java.util.Scanner;

public class RevString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string:");
		String str = sc.nextLine();
		String rev = "";
		for(int i=str.length()-1 ; i>=0;i--) {
			rev = rev + str.charAt(i);
			System.out.print( str.charAt(i));
		}
		System.out.println();
		System.out.println(rev);
		
		sc.close();
		
		//using inbuilt h
		StringBuilder sb = new StringBuilder(str);
		System.out.println(sb.reverse());
	}

}
