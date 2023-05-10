package day7.capg;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {

	public static void main(String[] args) {

		Set<Integer> set = new HashSet<Integer>();
		set.add(20);
		set.add(61);
		set.add(44);
		set.add(161);
		set.add(61); // no duplicate elements
		for (Integer num : set) {
			System.out.println(num); // not in order
		}
		set.remove(44);
		System.out.println("After removing : " + set);
		// using Iterator
		Iterator<Integer> val = set.iterator();
		while (val.hasNext()) {
			System.out.println(val.next());
		}
		System.out.println(set.contains(61));
		// Linked hashset prints in order of insertion
		Set<Integer> set2 = new LinkedHashSet<Integer>(set); // passing same set to treeset to sort
		System.out.println(set2);

		// treeSet to get sorted set
		Set<Integer> set1 = new TreeSet<Integer>(set); // passing same set to treeset to sort
		System.out.println(set1);
	}
}
