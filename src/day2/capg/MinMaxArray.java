package day2.capg;
//[4] Minimum and maximum values in an array. 

public class MinMaxArray {
	public static void main(String[] args) {
		int[] arr = { 5, 2, 10, 15, 1, 20 };
		int min = arr[0];
		int max = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
			}
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		System.out.println("Minimum value in the array: " + min);
		System.out.println("Maximum value in the array: " + max);
	}
}
