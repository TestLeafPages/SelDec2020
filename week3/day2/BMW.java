package week3.day2;

import week3.day1.Car;
import week3.day1.Vehicle;

public class BMW extends Vehicle{

	public void autoPark() {
		System.out.println("auto park sensor");

	}

	public static void main(String[] args) {

		Vehicle veh = new Vehicle();
		veh.applyBrake();

		/*
		 * BMW myBmw = new BMW();
		 * 
		 * myBmw.applyBrake(); myBmw.soundHorn(); myBmw.driveCar(); myBmw.autoPark();
		 */

	}

}
