package com.setAssignment;

import java.util.TreeSet;

public class ReverseTreeSet {

	public static void main(String[] args) {

		TreeSet<Integer> treeSet = new TreeSet<>();
		treeSet.add(3);
		treeSet.add(1);
		treeSet.add(2);

		TreeSet<Integer> reverseTreeSet = (TreeSet<Integer>) treeSet.descendingSet();

		// Print the reverse order view of the TreeSet
		System.out.println(reverseTreeSet);
	}

}
