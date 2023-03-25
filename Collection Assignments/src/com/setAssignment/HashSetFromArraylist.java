package com.setAssignment;

import java.util.ArrayList;
import java.util.HashSet;

public class HashSetFromArraylist {

	public static void main(String[] args) {
		// Create an ArrayList of integers
		ArrayList<Integer> arrayList = new ArrayList<>();
		arrayList.add(1);
		arrayList.add(2);
		arrayList.add(3);

		// Create the HashSet
		HashSet<Integer> hashSet = new HashSet<>(arrayList);

		// Print the HashSet
		System.out.println(hashSet);
	}

}
