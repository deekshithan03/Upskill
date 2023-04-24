package day2.capg;
//[7]find duplicates
import java.util.Arrays;

public class DuplicateArray {
    public static void main(String[] args) {
        int[] arr = { 5, 2, 10, 15, 2, 20, 10, 2 ,5};
        int len = arr.length;
        int count = 0;
        
        Arrays.sort(arr);        
        for (int i = 0; i < len - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                count++;
                for (int j = i + 1; j < len - 1; j++) {
                    arr[j] = arr[j + 1];
                }
                len--;
                i--;
            }
        }        
        System.out.print("Array without duplicates: ");
        for (int i = 0; i < len; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("Number of duplicates: " + count);
    }
}
