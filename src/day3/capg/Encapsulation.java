package day3.capg;

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
