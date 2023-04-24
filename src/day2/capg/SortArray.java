package day2.capg;

import java.util.Arrays;

//[6]	Program to sort an array. 

public class SortArray {

	public static void main(String[] args) {
		int[] arr = { 10, 40, 23, 41, 1, 37 };
		int temp;
		for (int i = 0; i < arr.length - 1; i++) {// ascending order
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
//		Arrays.sort(arr);
//		for (int i = 0; i < arr.length; i++) {
//			System.out.println(arr[i]);
//		}

	}  
}
