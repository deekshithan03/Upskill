package day7.capg;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class MapDemo {

	public static void main(String[] args) {
		Map<String, Integer> students = new HashMap<>();
		students.put("John", 90);
		students.put("Andy", 64);
		students.put("Amy", 85);
		students.put("Mahesh", 71);
		students.put("Smriti", 55);

		for (String name : students.keySet()) { // datatype of key should be given
			System.out.println(name + " : " + students.get(name));
		}
		// another way of enhanced for loop
		for (Map.Entry<String, Integer> entry : students.entrySet()) {
			String key = entry.getKey();
			int value = entry.getValue();
			System.out.println(key + ":" + value);
		}
		students.remove("Amy");
		System.out.println("After removing amy:" + students);

		System.out.println(students.get("Mahesh"));
		System.out.println("Contains amy?:" + students.containsKey("Amy"));

		// Iterating using Iterator
		System.out.println("using iterator:");
		Iterator<Map.Entry<String, Integer>> iterator = students.entrySet().iterator();
		while (iterator.hasNext()) {
			Map.Entry<String, Integer> entry = iterator.next();
			String key = entry.getKey();
			int value = entry.getValue();
			System.out.println(key + ": " + value);
		}
		
		//treeMap to get sorted based on key 
		Map<String, Integer> studentSorted = new TreeMap<>(students);
		System.out.println("Sorted : "+studentSorted);
	}
}
