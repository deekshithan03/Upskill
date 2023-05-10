package day7.capg;

//implementing comparable interface
//and using compateTo() method

import java.util.ArrayList;
import java.util.Collections;

class Student implements Comparable<Student> {
	// Student
	String name;
	int age;

	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}

	@Override
	public int compareTo(Student o) {
		if (this.age > o.age) // comparing current object to next obj
			return 1;
		else
			return -1;
	}
}

public class SortUsingComparable {
	public static void main(String[] args) {

		ArrayList<Student> students = new ArrayList<>();
		students.add(new Student("Pavan", 21));
		students.add(new Student("Deeksha", 23));
		students.add(new Student("Carl", 19));
		students.add(new Student("Mahesh", 30));

		Collections.sort(students);

		for (Student stu : students) {
			System.out.println(stu);
		}
	}
}
