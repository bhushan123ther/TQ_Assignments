package com.setAssignment;

import java.util.LinkedHashSet;

public class RemoveAllEleFromLHS {

	public static void main(String[] args) {
		LinkedHashSet<String> lhs = new LinkedHashSet<>();
		lhs.add("Orange");
		lhs.add("Apple");
		lhs.add("Banana");
		lhs.add("Cherry");

		lhs.removeAll(lhs);

		System.out.println(lhs);
	}

}
