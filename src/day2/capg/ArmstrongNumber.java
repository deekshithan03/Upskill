package day2.capg;

// armstrong - cube of each digit is equal to the given number
import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
	 System.out.println("Enter the number: ");
	 int a =sc.nextInt();
	 int sum = 0;
	 int rem;
	 int temp = a;
	 while(temp!=0) {
		 rem = temp%10;
		 sum = sum+(rem*rem*rem);
		 temp = temp/10;
	 }
	 if(sum==a) {
		 System.out.println(a + " is an Armstrong number");
	 }
	 else System.out.println(a+ " is not armstrong number");
	}

}
