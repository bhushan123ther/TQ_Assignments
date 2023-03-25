package com.setAssignment;

import java.util.HashSet;
import java.util.TreeSet;

public class TreeSetFromHashSet {

	public static void main(String[] args) {
		// Create a HashSet of integers
		HashSet<Integer> hashSet = new HashSet<>();
		hashSet.add(3);
		hashSet.add(1);
		hashSet.add(2);

		// create a TreeSet from the HashSet using the constructor
		TreeSet<Integer> treeSet = new TreeSet<>(hashSet);

		// Print the TreeSet
		System.out.println(treeSet);

	}

}
