package com.setAssignment;

import java.util.LinkedHashSet;

public class LHSUsingGenerics {

	public static void main(String[] args) {
		LinkedHashSet<String> lhs = new LinkedHashSet<>();
		lhs.add("Pink");
		lhs.add("White");
		lhs.add("Black");
		lhs.add("Yello");

		System.out.print(lhs);
	}

}
