package com.setAssignment;

import java.util.HashSet;
import java.util.Set;

public class PrintContenetInSet {

	public static void main(String[] args) {

		Set<String> myset = new HashSet<String>();
		myset.add("Orange");
		myset.add("Apple");
		myset.add("Banana");
		myset.add("Papaya");

		for (String str : myset) {
			System.out.println(str);
		}
	}

}
