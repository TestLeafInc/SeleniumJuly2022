package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListBasics {

	public static void main(String[] args) {
		
		List<String> learners = new ArrayList<String>();
		learners.add("Hema");
		learners.add("Anil");
		learners.add("Raj");
		learners.add("Saranya");

		int count = learners.size();
		System.out.println(count);
		
		learners.remove("Raj");
		System.out.println(learners);

		learners.add(1, "Indhu");
		learners.add("Anil");
		System.out.println(learners);

		System.out.println(learners.get(0));
		
		//learners.clear();
		System.out.println(learners);
		
		Collections.sort(learners);
		System.out.println(learners);
		
		for (int i = 0; i < learners.size(); i++) {
			System.out.println();
		}

	}

}
