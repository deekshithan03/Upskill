package day2.capg;
//[16]Write a method to print the sum of array, and pass an anonymous array to the method . 

public class SumOfArray {
		public static void sum(int[] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		System.out.println("Sum of array: " + sum);
	}
		
		public static void main(String[] args) {
			sum(new int[] { 1, 2, 3, 4, 5 });
		}


}
