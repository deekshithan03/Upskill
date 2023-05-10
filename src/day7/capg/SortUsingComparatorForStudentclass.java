package day7.capg;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

//creating Student data with ArrayList and also Comparator

class Students {
	// Student
	String name;
	int age;

	public Students(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Students [name=" + name + ", age=" + age + "]";
	}
}

public class SortUsingComparatorForStudentclass {
	public static void main(String[] args) {
		// to compare based on age
		Comparator<Students> compareAge = new Comparator<Students>() {

			@Override
			public int compare(Students o1, Students o2) {
				if (o1.age > o2.age)
					return 1;
				else
					return -1;
			}
		}; //using lambda can reduce lines
//		Comparator<Students> compareAge = ( o1,  o2) -> o1.age > o2.age?1:-1;

		ArrayList<Students> students = new ArrayList<>();
		students.add(new Students("Pavan", 21));
		students.add(new Students("Deeksha", 23));
		students.add(new Students("Carl", 19));
		students.add(new Students("Mahesh", 30));

		Collections.sort(students, compareAge);

		for (Students stu : students) {
			System.out.println(stu);
		}
	}
}
