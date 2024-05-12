package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LearnList {
	public static void main(String[] args) {
		
		//Syntax to declare list		
		List<String> mentors = new ArrayList<String>();
		
		// to add items into the list
		mentors.add("Aravind");
		mentors.add("Raghu");
		mentors.add("Gokul");
		mentors.add("Vinoth");
		mentors.add("Vineeth");
		mentors.add(3, "Muthu");
		mentors.add("Vineeth");
		
		// to find the size of the list
		System.out.println("The total size of the list is : "+mentors.size());
		
		// to sort the list
		Collections.sort(mentors);
		
		// to retrieve a particular item from the list
		System.out.println(mentors.get(2));
		
		System.out.println(mentors);
		
		// to remove a particular item from the list
		mentors.remove(2);
		
		System.out.println("The total size of the list is : "+mentors.size());
		// to print the list
		System.out.println(mentors);
		System.out.println(mentors.isEmpty());
		
		//to clear all items from the list
		mentors.clear();
		
		System.out.println(mentors.isEmpty());
		
		
	
	}

}
