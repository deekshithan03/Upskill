package day5.capg;

import java.util.Scanner;
import java.util.function.BiConsumer;

public class BiConsumerAdd {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two nummber:");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		BiConsumer<Integer, Integer> add = (x,y)-> {
			System.out.println(x+y);
		};
		add.accept(n1, n2);
		sc.close();
	}

}
