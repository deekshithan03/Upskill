package day3.capg;
//Encapsulation 
//Create a class named "Person" with private instance variables for "name" and "age". 
//Add public methods to set and get these variables. 
//Create an instance of the class and print the name and age using the get methods.

class Person{
	private int age;
	private String name;
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age= age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
}
public class Encapsulation {

	public static void main(String[] args) {
		Person person = new Person();
		person.setAge(20);
		person.setName("Grace");
		System.out.println("Name:"+ person.getName()+" and "+"Age:"+ person.getAge());
	}

}
