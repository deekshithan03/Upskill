package day7.capg;

import java.util.*;
import java.util.function.Consumer;

//another way to add values to arraylist using Arrays.asList()
//forEach method  - takes in Consumer object(lambda can be used)
public class ValuesUsingAsList {

	public static void main(String[] args) {
		List<Integer> nums = Arrays.asList(2, 5, 3, 7, 3);
		//System.out.println(nums);
		
//		Consumer com = new Consumer<Integer>() {
//
//			@Override
//			public void accept(Integer n) {		
//				System.out.println(n);
//			}
//		};
//		nums.forEach(com);
		//above can be reduced as
//		Consumer com =  n -> System.out.println(n);
//		nums.forEach(com);
		//or we can directly pass the statement inside forEach
		nums.forEach(n->System.out.println(n));
	}

}
