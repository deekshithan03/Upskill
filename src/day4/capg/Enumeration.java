package day4.capg;
//3. Write a Java program to implement a simple traffic light simulation using enums.

enum TrafficLight{
	RED,YELLOW,GREEN
}

public class Enumeration {
	public static void main(String[] args) {
		TrafficLight status = TrafficLight.RED;
		
		if(status==TrafficLight.RED) {
			System.out.println("STOP!");
		}
		else if(status==TrafficLight.YELLOW) {
			System.out.println("PLEASE WAIT..");
		}
		else
			System.out.println("GO!");
		//to print all values
//		TrafficLight[] stat = TrafficLight.values();
//		for(TrafficLight s:stat) {
//			System.out.println(s);
//		}
	}

}
