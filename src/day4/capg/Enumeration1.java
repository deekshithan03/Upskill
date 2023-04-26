package day4.capg;

enum Cars{
	Honda(2000),Kia(3000),Toyota(1500),Maruthi(4000);
	
	private int price;
	//object created in same class
	private Cars(int price){        
		this.price = price;
	}
	public int getPrice() {
		return price;
	}
}

public class Enumeration1 {
	public static void main(String[] args) {
		Cars car = Cars.Maruthi;
		System.out.println(car +":"+car.getPrice());
		
//		Cars[] cars = Cars.values();
		for(Cars c:Cars.values()) {
			System.out.println(c+ ":"+ car.getPrice());
		}
	}

}
