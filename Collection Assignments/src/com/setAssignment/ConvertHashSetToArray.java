package com.setAssignment;

import java.util.HashSet;

public class ConvertHashSetToArray {

	public static void main(String[] args) {
		HashSet<String> hashSet = new HashSet<String>();
		hashSet.add("apple");
		hashSet.add("banana");
		hashSet.add("orange");

		String[] array = hashSet.toArray(new String[hashSet.size()]);

		for (String s : array) {
			System.out.println(s);
		}
	}

}
