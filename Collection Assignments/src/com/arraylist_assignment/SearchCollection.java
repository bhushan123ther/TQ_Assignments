//15. WAP to search the specified collection in this collection

package com.arraylist_assignment;

import java.util.ArrayList;

public class SearchCollection {

	public static void main(String[] args) {

		ArrayList<String> names = new ArrayList<String>();

		names.add("Bhushan");
		names.add("Nitu");
		names.add("Vishal");
		names.add("Rahul");

		ArrayList<String> newNames = new ArrayList<>();

		newNames.add("Bhushan");
		newNames.add("Ravi");
		newNames.add("Nitu");
		newNames.add("Rahul");

		boolean checkcontainsAll = names.containsAll(newNames);

		if (checkcontainsAll) {
			System.out.println("The collection contains all elements of the specified collection.");
		} else {
			System.out.println("The collection does not contain all elements of the specified collection.");
		}
	}
}
