package day6.capg;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

//Write a Java program that defines a method that throws multiple exceptions, 
//and use the throws keyword to declare them in the method signature.

public class MultipleException {

	public static void exampleMethod() throws IOException,FileNotFoundException
	{
			File file = new File("hello.txt");
			Scanner sc = new Scanner(file);
			while(sc.hasNextLine()) {
				String line = sc.nextLine();
				System.out.println(line);
			}
			sc.close();
	}
	public static void main(String[] args) {
		
		try {
			exampleMethod();
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

}
