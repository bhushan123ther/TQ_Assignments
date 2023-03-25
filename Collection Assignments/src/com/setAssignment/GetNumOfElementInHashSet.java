package com.setAssignment;

import java.util.HashSet;

public class GetNumOfElementInHashSet {

	public static void main(String[] args) {
		HashSet<String> hashSet = new HashSet<>();
		hashSet.add("apple");
		hashSet.add("banana");
		hashSet.add("orange");
		hashSet.add("Chery");

		int size = hashSet.size();

		System.out.println("The HashSet contains " + size + " elements.");
	}

}
