package week1.day1;

public class Car {
	
	String bodyColor = "Red";
	int numWheels = 4;
	String regNumber = "TN 09 AU 4769";
	double fuelCapacity = 56.85;
	char fuelType = 'P';
	boolean isPuncture = false;
		
	//accessSpecifier returnType methodName() (type method name and ctrl+space)
	public void driveCar() {
		int numOfDrivers = 2; //local variable
		System.out.println(numOfDrivers);
		System.out.println("I drive a car"); //type syso and ctrl+space
	}
	
	public void applyBreak() {
		System.out.println("applied brake");

	}
		
	public static void main(String[] args) {
		//ClassName objectName = new ClassName()
		Car obj = new Car();
		
		obj.driveCar();
		obj.applyBreak();
			
		System.out.println(obj.fuelCapacity);
		
		String color = obj.bodyColor;
		System.out.println(color);
		
		char ft = obj.fuelType;
		System.out.println(ft);
		
		
		
		
		
		
			
	}
	

}
