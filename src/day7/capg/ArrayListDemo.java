package day7.capg;

import java.util.ArrayList;
import java.util.Collections;
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
		list.remove(1);    //in arraylist we use index to manipulate
		System.out.println("After removing:"+list);
		
		System.out.println("Contains grapes?: "+list.contains("grapes"));  //contains method
		
		System.out.println("using Iterator:");
		Iterator<String> values = list.iterator();
		while(values.hasNext()) {
			System.out.println(values.next());
		}
		list.add(1, "strawberry");  //to add element at specific index
		System.out.println(list);
		list.set(3, "updatedPear");  //to update any element
		System.out.println(list);
		Collections.sort(list);   //sorts in ascending
		System.out.println(list);
	}
}
