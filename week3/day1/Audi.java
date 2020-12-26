package week3.day1;

public class Audi extends Car {
	
	public void airBag() {
		System.out.println("4 air bags");

	}
	
	
	public static void main(String[] args) {
		Audi myAudi = new Audi();
		
		myAudi.applyBrake();
		
		/*
		 * myAudi.applyBrake(); myAudi.soundHorn(); myAudi.driveCar(); myAudi.airBag();
		 */
	}
	

}
