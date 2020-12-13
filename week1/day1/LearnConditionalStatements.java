package week1.day1;

public class LearnConditionalStatements {

	public static void main(String[] args) {

		int age = -2;
		
		if(age < 18) {
			System.out.println("minor");
		}else if(age >= 18 && age < 60) {
			System.out.println("adult");
		}else if(age > 60 && age < 80){
			System.out.println("senior citizen");
		}else {
			System.out.println("super senior");
		}

		/*
		 * if (age < 18) { System.out.println("minor");
		 * System.out.println("not eligible to vote"); }else {
		 * System.out.println("major"); }
		 */

	}

}
