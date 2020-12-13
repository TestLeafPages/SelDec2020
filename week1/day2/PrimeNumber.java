package week1.day2;

public class PrimeNumber {

	public static void main(String[] args) {
		int input = 11;
		
		int count = 0;
		
		
		for (int i = 1; i <= input; i++) {
			
			if(input % i == 0) {
				count = count + 1;
			}
			
		}
		
		if(count == 2) {
			System.out.println("Given number is prime");
		}
		else {
			System.out.println("Given number is not prime");
		}
			
		
		
		
		
		

	}

}
