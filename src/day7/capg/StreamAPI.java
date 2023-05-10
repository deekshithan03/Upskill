package day7.capg;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;
import java.util.Arrays;

public class StreamAPI {

	public static void main(String[] args) {
		List<Integer> num = Arrays.asList(56,42,55,87,13,18,22,80);
		System.out.println(num);
		//stream of operations
//		Optional<Integer> result = num.stream()
//				        .filter(n-> n%2==0)
//				        .map(n->  n*2)
//				        .reduce((a,b)-> a+b);
//		System.out.println(result);
		
		//creating new stream
		Stream<Integer> s = num.stream()
								.filter(n-> n%2==0)
						        .map(n->  n*2)
						        .sorted();
                           		//use forEach to print stream obj
		s.forEach(n-> System.out.println(n));
					        
	}

}
   