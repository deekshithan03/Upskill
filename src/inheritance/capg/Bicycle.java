package inheritance.capg;

public class Bicycle {
	
	protected int speed;
	protected int gear;
	
	public Bicycle(int speed, int gear) {
		this.speed = speed;
		this.gear = gear;
	}
	
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public int getGear() {
		return gear;
	}
	public void setGear(int gear) {
		this.gear = gear;
	}
	//method 
	public void applyBrake(int decrement) {
		speed-=decrement;
	}
	public void speedUp(int increment) {
		speed+=increment;
	}
	
}