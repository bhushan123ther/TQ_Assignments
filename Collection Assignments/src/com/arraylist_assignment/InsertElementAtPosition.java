//17. WAP to insert an element into the ArrayList at the first position

package com.arraylist_assignment;

import java.util.ArrayList;

public class InsertElementAtPosition {

	public static void main(String[] args) {

		ArrayList<String> names = new ArrayList<String>();
		names.add("Bhushan");
		names.add("Teju");
		names.add("Janhavi");
		names.add("Sakshi");

		names.add(1, "Ravi");

		System.out.println(names);

	}
}
