package day2.capg;

//[17]Clone an array

public class CloneArray {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5 };
		int[] cloneArr = new int[arr.length];
		for(int i =0;i<arr.length;i++) {
			cloneArr[i]=arr[i];
		}
		System.out.print("Cloned Array: ");
		for(int n:cloneArr) {
			System.out.print(n+" ");
		}
	}
}
