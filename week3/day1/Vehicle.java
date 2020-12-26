package week3.day1;

public class Vehicle{
	
	private String vehicleName = "xcent";
	
	public void applyBrake() {
		System.out.println("applied brake - Vehicle");

	}
	
	public void soundHorn() {
		
		System.out.println("applied horn");
	}

	
	public static void main(String[] args) {
		Vehicle veh = new Vehicle();
				veh.applyBrake();
		
	}
}
