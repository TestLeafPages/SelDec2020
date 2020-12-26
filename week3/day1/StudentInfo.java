package week3.day1;

public class StudentInfo {

	public void getStudentDetails(int studId) {

		System.out.println("Hari");
	}

	public void getStudentDetails(int studId, int phno) {

		System.out.println(phno);
	}

	public void getStudentDetails(String name) {
		System.out.println("Prasad");
	}
	
	public void getStudentDetails(int studId, String studName) {

		System.out.println(studName);
	}
	
	public void getStudentDetails(String email, int studid) {

		System.out.println(email);
	}
	
	
	
	
	
	
	
	

	public static void main(String[] args) {
		StudentInfo si = new StudentInfo();

		si.getStudentDetails(100);
		
		si.getStudentDetails("sdfsdf",200);

		si.getStudentDetails("Hari");

	}

}
