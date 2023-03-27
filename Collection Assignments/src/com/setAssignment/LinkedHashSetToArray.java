package com.setAssignment;

import java.util.LinkedHashSet;

public class LinkedHashSetToArray {

	public static void main(String[] args) {

		LinkedHashSet<String> lhs = new LinkedHashSet<>();
		lhs.add("Orange");
		lhs.add("Apple");
		lhs.add("Banana");
		lhs.add("Cherry");

		String[] fruits = lhs.toArray(new String[lhs.size()]);

		for (String element : fruits) {
			System.out.println(element);
		}
	}

}
