package inheritance.capg;

public class MountainBike extends Bicycle {
	
	public int height;

	public MountainBike(int height,int speed, int gear) {
		super(speed, gear);         //super keyword to inherit the properties from base class
		this.height=height;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}
		
}
