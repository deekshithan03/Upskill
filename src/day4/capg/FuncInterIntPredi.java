package day4.capg;

//to check even no.
import java.util.function.IntPredicate;

public class FuncInterIntPredi { // Functional interface IntPredicate

	public static void main(String[] args) {

		IntPredicate isEven = n -> n % 2 == 0;
		boolean result = isEven.test(20);
		System.out.println(result);
	}

}
