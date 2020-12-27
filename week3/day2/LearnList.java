package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class LearnList {

	public static void main(String[] args) {
		
		List<String> values = new LinkedList<String>();
		
	//	List<String> newValues = new ArrayList<String>();
		
		//method to add values into list
		values.add("Hari");  //index starts from 0
		values.add("Naveen");
		values.add("Sam");
		values.add("Bowya");
		values.add("Dhivya");
		values.add("Naveen"); // last index is size-1
		
		//method to get the number of items in list
		System.out.println(values.size());
		
		//to get single data from list
		//System.out.println(values.get(1));
		
		
		//values.remove(3);
		//.remove("Naveen");
		
		//method to copy data from one list to another list
	//	newValues.addAll(values);
		
		//to sort the data in list
		Collections.sort(values);
		Collections.reverse(values);
		
		for (Object eachValue : values) {
			
			System.out.println(eachValue);
			
		}
		

		

	}

}
