package day6.capg;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//Write a Java program that demonstrates 
//the use of try-with-resources to automatically close resources.

public class TryWithResources {

	public static void main(String[] args) {

		String str = null;
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			str = br.readLine();
			System.out.println(str);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
