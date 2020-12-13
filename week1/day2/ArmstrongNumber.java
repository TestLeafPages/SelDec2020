package week1.day2;

public class ArmstrongNumber {

	public static void main(String[] args) {
		int input = 371;

		int orginalInput = input;

		int sum = 0;

		while (input > 0) {
			//371 % 10 = 1
			int rem = input % 10;

			// sum = 0 + 1;
			sum = sum + (rem * rem * rem);

			// change the number from 153 to 15 ; 371 / 10 = 37;
			input = input / 10;

		}

		if (sum == orginalInput) {
			System.out.println("Given number is armstrong");
		} else {
			System.out.println("Given number is not armstrong");
		}

	}

}
