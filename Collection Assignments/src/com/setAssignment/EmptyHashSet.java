package com.setAssignment;

import java.util.HashSet;

public class EmptyHashSet {

	public static void main(String[] args) {
		HashSet<Integer> hashSet = new HashSet<>();
		hashSet.add(1);
		hashSet.add(2);
		hashSet.add(3);

		// Empty the HashSet using the clear() method
		hashSet.clear();

		System.out.println(hashSet);

	}

}
