package week3.day2;

import java.util.ArrayList;
import java.util.List;

public class LearnStringMethods {

	public static void main(String[] args) {
		//literal String declaration
		String str = "Welcome"; //first character index 0. last character index is length()-1
		
		for (int i = str.length()-1; i >= 0; i--) {
			System.out.print(str.charAt(i));
			
		}
		
		/*
		 * char[] charArray = str.toCharArray(); for (int i = charArray.length-1; i >= 0
		 * ; i--) { System.out.print(charArray[i]);
		 * 
		 * }
		 */
		
		
		
		
		/*
		 * String[] split = str.split(" ");
		 * 
		 * for (String eachWord : split) {
		 * 
		 * System.out.println(eachWord);
		 * 
		 * }
		 */
		
		//System.out.println(str.substring(2));
		
		//System.out.println(str.substring(2, 5));
		
		/*
		 * //method to convert the String into char array char[] charArray =
		 * str.toCharArray();
		 * 
		 * List<Character> listValues = new ArrayList<Character>();
		 * 
		 * for (char ch : charArray) { listValues.add(ch);
		 * 
		 * }
		 */
				
		/*
		 * int count = str.length(); String newString = str.replace("e", ""); int
		 * newCount = newString.length(); System.out.println(count-newCount);
		 */
		
		
		//String str1 = "welcome"; //sequence of characters. each character is saved with index
		
		//int len = str.length();
		
		
		
		//System.out.println(str.replace('e', 'x'));
		//System.out.println(str.replace("come", "said"));
		
		//to get single character form String
		//System.out.println(str.charAt(len-1));
		
		//to get the number of character in String
		//System.out.println(str.length());
			
		
		//System.out.println(str.equals(str));
		
		//System.out.println(str.equalsIgnoreCase(str));
		
		/*
		 * System.out.println(str == str1); //using new keyword String str2 = new
		 * String("Welcome"); System.out.println(str == str2);
		 * 
		 * //to compare the string values System.out.println(str.equals(str1));
		 * 
		 * System.out.println(str.equals(str2));
		 */

	}

}
