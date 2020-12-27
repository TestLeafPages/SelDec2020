package week3.day2;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {
		String[] input = {"HCL","Infosys","Wipro","Infosys","TCS"};
		
		Set<String> setValues = new LinkedHashSet<String>();
		
		for (String eachData : input) {
			setValues.add(eachData);
			
		}

		for (String eachSetData : setValues) {
			System.out.println(eachSetData);
		}
	}

}
