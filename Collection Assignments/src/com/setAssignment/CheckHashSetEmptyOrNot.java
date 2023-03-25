package com.setAssignment;

import java.util.HashSet;

public class CheckHashSetEmptyOrNot {

	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<>();
		hs.add("Orange");
		hs.add("Apple");
		hs.add("Banana");
		hs.add("Cherry");

		if (hs.isEmpty()) {
			System.out.println("Yes, HashSet is empty");
		} else {
			System.out.println("No,HashSet is not empty");
		}

	}

}
