package day2.capg;

import java.util.Arrays;

//[5] Count of repeated values in an array.  
public class RepeatCount {
    public static void main(String[] args) {
        int[] arr = { 5, 2, 10, 15, 2, 20, 10, 2,5 };
        
        int[] countArr = new int[arr.length];
        Arrays.sort(arr);

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    countArr[i]++;
                }
            }
        }
        
        for (int i = 0; i < arr.length; i++) {
            if (countArr[i] > 0) {
                System.out.println("Value " + arr[i] + " is repeated " + (countArr[i] + 1) + " times");
            }
        }
    }
}
