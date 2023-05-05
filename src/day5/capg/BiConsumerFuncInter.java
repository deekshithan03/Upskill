package day5.capg;

import java.util.Scanner;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;

public class BiConsumerFuncInter {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two nummber:");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		BiConsumer<Integer, Integer> isSmaller = (x, y) -> {
			if (x < y) {
				System.out.println(x + " is less than " + y);
			} else if (x > y) {
				System.out.println(y + " is less than " + x);
			} else
				System.out.println("Both are equal");
		};
		isSmaller.accept(n1, n2);

		// BiFunction
		BiFunction<Integer, Integer, Integer> isLarger = (x, y) -> {
			if (x > y) {
				return x;

			} else
				return y;
		};
		System.out.println("Larger num:" + isLarger.apply(n1, n2));
		sc.close();
	}

}
