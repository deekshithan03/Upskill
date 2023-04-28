package day4.capg;

enum Cars {
	HONDA(2000), KIA(3000), TOYOTA(1500), MARUTHI(4000);

	private int price;

	// object created in same class
	private Cars(int price) {
		this.price = price;
	}

	public int getPrice() {
		return price;
	}
}

public class Enumeration1 {
	public static void main(String[] args) {
		Cars car = Cars.MARUTHI;
        switch(car) {
		
	  	 case HONDA:
			System.out.println(car +":"+car.getPrice());
			break;
		 case KIA:
			System.out.println(car +":"+car.getPrice());
			break;
		 case TOYOTA:
			System.out.println(car +":"+car.getPrice());
			break;
		 default:
			System.out.println(car +":"+car.getPrice());
			break;
		}
//		Cars[] cars = Cars.values();
        System.out.println("Array of Objects:");
		for(Cars c:Cars.values()) {
			System.out.println(c+ ":"+ car.getPrice());
		}
	}

}
