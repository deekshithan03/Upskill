package day4.capg;
//Write a Java program to read a file and handle a FileNotFoundException.

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ExceptionFileNotFound {

	public static void main(String[] args) {
		try {
			File file = new File("hello.txt");
			Scanner sc = new Scanner(file);
		} catch (FileNotFoundException e) {
			System.out.println(e);
		}

	}

}
