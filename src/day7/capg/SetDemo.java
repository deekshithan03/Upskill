package day7.capg;

import java.util.HashSet;
import java.util.Set;

public class SetDemo {

	public static void main(String[] args) {

		Set<Integer> set = new HashSet<Integer>();
		set.add(20);
		set.add(61);
		set.add(44);
		set.add(16);
		for(Integer num : set) {
			System.out.println(num);
		}

	}

}
