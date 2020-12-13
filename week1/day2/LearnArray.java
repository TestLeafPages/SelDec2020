package week1.day2;

import java.util.Arrays;

public class LearnArray {

	public static void main(String[] args) {
		/*
		 * int num1 = 10; int num2 = 20;
		 */
		
		//int[] num = new int[5];//
		
		int[] num = {30,20,40,10,50};
		
		//num[0] = 10; //first data index should be 0
		//num[1] = 50;
		//num[2] = 60;
		//num[3] = 30; 
		//num[4] = 40; //last data index should be length-1
		
		//last data index
		System.out.println(num.length);
		
		//to get the first data from array
		//System.out.println(num[0]);
		
		//to get last data
		//System.out.println(num[num.length-1]);
		
		/*
		 * for (int i = num.length-1; i >= 0; i--) {
		 * 
		 * System.out.println(num[i]); }
		 */
		//method to sort the array data in ascending order
		Arrays.sort(num);
		
		for (int i : num) {
			System.out.println(i);
		}
		
		
		
		/*
		 * for (int i = num.length-1; i >= 0 ; i--) {
		 * 
		 * System.out.println(num[i]); }
		 */
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
