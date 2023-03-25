package com.setAssignment;

import java.util.TreeSet;

public class PollFirstTreeSet {

	public static void main(String[] args) {
		// Create a TreeSet of integers
		TreeSet<Integer> treeSet = new TreeSet<>();
		treeSet.add(3);
		treeSet.add(1);
		treeSet.add(2);

		// Retrieve and remove the lowest element of the TreeSet using a single method
		// call
		int lowest = treeSet.pollFirst(); // Retrieves and removes the first (lowest) element,or returns null if this
											// set is empty.

		// Print the TreeSet after removing the lowest element
		System.out.println(treeSet);

	}

}
