package day3.capg;

//Constructor
//Create a class named "Person" with private instance variables for "name" and "age". 
//Add a constructor that initializes these variables. 
//Create an instance of the class and print the name and age using the get methods.

class Person1{
	private String name;
	private int age;
	
	public Person1(String name, int age) {
		this.age=age;
		this.name=name;
	}
	
	public String getname() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age=age;
	}
}
public class Constructor {

	public static void main(String[] args) {

		Person1 person = new Person1("Grace",20);
		System.out.println("Name:"+person.getname()+" and "+"Age:"+person.getAge());
	}

}
