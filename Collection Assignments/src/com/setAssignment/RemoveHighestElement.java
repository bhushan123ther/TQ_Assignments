package com.setAssignment;

import java.util.TreeSet;

public class RemoveHighestElement {

	public static void main(String[] args) {

		TreeSet<Integer> treeset = new TreeSet<>();

		treeset.add(10);
		treeset.add(20);
		treeset.add(30);

		// Using a single method call to retrieve and remove the highest element
		Integer highest1 = treeset.pollLast();
		System.out.println("Highest element (single method call) : " + highest1);

		// Using two method calls to retrieve and remove the highest element

		Integer highest2 = treeset.last();
		treeset.remove(highest2);
		System.out.println("Highest element (two method calls) : " + highest2);

		// Printing the remaining elements in the treeset

		System.out.println("Remaining elements : " + highest2);

		System.out.println("Remaining elements : " + treeset);
	}

}
