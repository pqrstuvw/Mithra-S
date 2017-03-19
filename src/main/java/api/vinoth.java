package classwork;

import java.util.ArrayList;
import java.util.List;

public class GetDuplicateCountInaList {

	public static void main(String[] args) {
		List<String> mentors = new ArrayList<String>();

		// Add mentors to the set -- Note the order
		mentors.add("vinoth");
		mentors.add("Gopi");
		mentors.add("Nesa");
		mentors.add("Bharath");
		mentors.add("Karim");
		mentors.add("Kader");
		mentors.add("Sakthi");
		mentors.add("vinoth");
		mentors.add("vinoth");
		mentors.add("vinoth");
		
		String checkDuplicates = "vinoth";
		int i=0;
		for (String mentor : mentors) {
			
			if(mentor.equals(checkDuplicates)){
				i++;
			}
		}
		System.out.println(i);
	}

}
