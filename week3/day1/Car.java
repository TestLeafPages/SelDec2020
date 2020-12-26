package week3.day1;

public class Car extends Vehicle {

	public void driveCar() {
		System.out.println("drive car");

	}

	public static void main(String[] args) {

		/*
		 * Vehicle veh = new Vehicle(); veh.applyBrake();
		 */

		Car obj = new Car();
		obj.applyBrake();

		/*
		 * obj.applyBrake(); obj.soundHorn();
		 */
		// obj.driveCar();

	}

}
