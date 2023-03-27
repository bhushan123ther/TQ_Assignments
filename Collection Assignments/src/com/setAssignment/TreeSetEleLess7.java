package com.setAssignment;

import java.util.TreeSet;

public class TreeSetEleLess7 {

	public static void main(String[] args) {
		TreeSet<Integer> treeSet = new TreeSet<Integer>();

		// Add elements to the TreeSet
		treeSet.add(3);
		treeSet.add(7);
		treeSet.add(2);
		treeSet.add(5);
		treeSet.add(1);

		// Find the numbers less than 7 in the TreeSet

		TreeSet<Integer> lessThanSeven = new TreeSet<Integer>();
		lessThanSeven = (TreeSet<Integer>) treeSet.headSet(7);

		System.out.println("The number less than 7 in the treeset are " + lessThanSeven);
	}

}
