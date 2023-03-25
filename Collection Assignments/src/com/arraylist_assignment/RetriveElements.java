//16. WAP to retrieve an element (at a specified index) from a given ArrayList

package com.arraylist_assignment;

import java.util.ArrayList;

public class RetriveElements {

	public static void main(String[] args) {

		ArrayList<String> names = new ArrayList<String>();
		names.add("Bhushan");
		names.add("Teju");
		names.add("Janhavi");
		names.add("Sakshi");

		int index = 1;

		String element = names.get(index);

		System.out.println("The element at index " + index + " is " + element + " .");
	}
}
