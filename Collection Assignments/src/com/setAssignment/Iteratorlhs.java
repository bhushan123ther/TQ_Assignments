package com.setAssignment;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class Iteratorlhs {

	public static void main(String[] args) {
		LinkedHashSet<String> lhs = new LinkedHashSet<>();
		lhs.add("Pink");
		lhs.add("White");
		lhs.add("Black");
		lhs.add("Yello");

		Iterator<String> itr = lhs.iterator();
		while (itr.hasNext()) {
			String element = itr.next();
			System.out.println(element);
		}
	}

}
