package week3.day1;

public class Employees {
	int empId;
	String empName;
	static String companyName;

	
	
	  Employees() { 
	  System.out.println("Child default constructor"); 
	  }
	 

	Employees(int empId, String empName, String companyName) {
		System.out.println("Parameterized constructor");
		this.empId = empId;
		this.empName = empName;
		this.companyName = companyName;
	}

	public void printEmployeeDetails() {
		System.out.println(empId);
		System.out.println(empName);
		System.out.println(companyName);

	}

	public static void printCompanyAddress() {
		System.out.println("Chennai");
	}

	public static void main(String[] args) {

		Employees emp = new Employees(100,"Hari","TestLeaf");
	}

}
