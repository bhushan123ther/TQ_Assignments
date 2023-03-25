package com.arraylist_assignment;

import java.util.ArrayList;
import java.util.Collections;

public class SwapArrayList {

	public static void main(String[] args) {

		ArrayList<String> al = new ArrayList<>();

		al.add("Apple");
		al.add("Banana");
		al.add("Grapes");
		al.add("Papaya");

		System.out.println("Original Arraylist : " + al);

		// swap the elements at index 0 and 2
		Collections.swap(al, 0, 2);

		System.out.println("Modified Arraylist : " + al);
	}

}
