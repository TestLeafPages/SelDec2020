package week1.day2;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the input for factorial calculation");
		int input = scan.nextInt();
		
		
	//	int input = 3;
		
		int fact = 1;
		
		for (int i = 1; i <= input; i++) {
			
			fact = fact * i;
			
		}
		//System.out.println("Factorial of numbe is");
		System.out.println("Factorial of number is "+fact);
	}

}
