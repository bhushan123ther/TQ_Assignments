package com.setAssignment;

import java.util.HashSet;
import java.util.Iterator;

public class IterateAllElement {

	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<>();
		hs.add("Pink");
		hs.add("White");
		hs.add("Orange");
		hs.add("Green");

		Iterator<String> itr = hs.iterator();
		while (itr.hasNext()) {
			String element = itr.next();
			System.out.println(element);
		}

	}

}
