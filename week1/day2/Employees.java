package week1.day2;

public class Employees {
	
	
	public void printEmployeeAddress(String empName) {
			System.out.println(empName);
			System.out.println("chennai");

	}
	
	public void printEmpployeePhoneNumber(String empName, int empId) {
		System.out.println(82423);

	}
	
	//argument is to give input
	public String getEmployeeName(int empId) {
		
		String name;
		if(empId == 100) {
			name = "Hari";
		}
		else {
			name = "Not available";
		}
		
		return name; //to give output

	}
	
	
	
	

	public static void main(String[] args) {
		Employees emp = new Employees();
		
		
		//emp.printEmployeeAddress("Hari");
		//emp.printEmpployeePhoneNumber("Hari", 100);
		
		 String employeeName = emp.getEmployeeName(100);
		 System.out.println(employeeName);
		
		
		
		
		
		
		
		
	}

}
