package day6.capg;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//Q: Write a Java program to read user input using BufferedReader.

public class BufferedReaderExample {

	public static void main(String[] args) {
		
		InputStreamReader in = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(in);
		String str = null;
		int x=0;
		try {
			System.out.println("Enter a string:");
			str = br.readLine();
			System.out.println("Enter an integer:");
			x = Integer.parseInt(br.readLine());
			System.out.println(str);
			System.out.println(x);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
