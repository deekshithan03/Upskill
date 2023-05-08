package day6.capg;

import java.io.*;

public class ThrowExcep {

	// function to check if person is eligible to vote or not
	public static void method() throws FileNotFoundException {

		FileReader file = new FileReader("C:\\Users\\Anurati\\Desktop\\abc.txt");
		BufferedReader fileInput = new BufferedReader(file);

		throw new FileNotFoundException();    //need to have throws declaration to throw checked exception 

	}

	// main method
	public static void main(String args[]) {
		try {
			method();
		} catch (FileNotFoundException e) {
			System.out.println();
		}
		System.out.println("rest of the code...");
	}

}
