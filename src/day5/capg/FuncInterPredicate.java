package day5.capg;

import java.util.function.BiPredicate;
import java.util.function.IntPredicate;

public class FuncInterPredicate {

	public static void main(String[] args) {

		IntPredicate obj1 = a-> a%2==0;
		System.out.println(obj1.test(19));

		BiPredicate<Integer, Integer> obj = (n,m) -> n==m;
		System.out.println(obj.test(5,5));

	}

}
