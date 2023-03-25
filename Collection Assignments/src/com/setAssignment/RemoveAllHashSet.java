package com.setAssignment;

import java.util.HashSet;

public class RemoveAllHashSet {

	public static void main(String[] args) {
		HashSet<String> hashSet = new HashSet<String>();
		hashSet.add("apple");
		hashSet.add("banana");
		hashSet.add("orange");

		hashSet.removeAll(hashSet);

		System.out.println(hashSet);
	}
}
