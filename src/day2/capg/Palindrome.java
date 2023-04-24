package day2.capg;

//palindrome - number should be equla to the reversed number = 12321
import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = sc.nextInt();
		int rem;
		int sum = 0;
		int temp = num;
		while (temp > 0) {
			rem = temp % 10;
			sum = (sum * 10) + rem;
			temp = temp / 10;
		}
		if (num == sum) {
			System.out.println("palindrome");
		} else {
			System.out.println("Not a palindrome");
		}
	}

}
