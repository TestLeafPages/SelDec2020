package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class LearnSet {

	public static void main(String[] args) {

		Set<String> values = new TreeSet<String>();

		// method to add values into list
		values.add("Hari"); // index starts from 0
		values.add("Naveen");
		values.add("Sam");
		values.add("Bowya");
		values.add("Dhivya");
		values.add("Naveen"); // last index is size-1

		List<String> listValues = new ArrayList<String>();

		listValues.addAll(values);

		//System.out.println(listValues.get(3));
		Collections.reverse(listValues);

		for (String eachValue : listValues) {
			System.out.println(eachValue);

		}

	}

}
