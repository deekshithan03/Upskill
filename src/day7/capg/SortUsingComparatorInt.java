package day7.capg;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class SortUsingComparatorInt {

	public static void main(String[] args) {
		ArrayList<Integer> num = new ArrayList<>();
		num.add(23);
		num.add(94);
		num.add(45);
		num.add(32);
		num.add(11);
		System.out.println(num);
		Collections.sort(num);
		System.out.println(num);
		
		//to compare using own logic use Comparator interface and compare method
		//eg:sort based on last integer
		Comparator<Integer> com = new Comparator<Integer>() {
			
			@Override
			public int compare(Integer o1, Integer o2) {
				if(o1%10>o2%10)    //logic to sort last digit
					return 1;         //return 1 will swap two numbers
				else
					return -1;        //return -1 will not swap
			}
		};  //anonymous class since Comparator is an interface
		Collections.sort(num,com);
		System.out.println("Sorting using compare method : "+num);
	}

}
