package day7.capg;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {
	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();
		list.add("apple");
		list.add("banana");
		list.add("mango");
		list.add("pear");
		for(String l:list) {
			System.out.println(l);
		}
		list.remove(1);
		System.out.println("After removing:");
		for(String l:list) {
			System.out.println(l);
		}
		
		System.out.println("Contains grapes?: "+list.contains("grapes"));
		System.out.println("using Iterator:");
		Iterator<String> values = list.iterator();
		while(values.hasNext()) {
			System.out.println(values.next());
		}
	}
}
