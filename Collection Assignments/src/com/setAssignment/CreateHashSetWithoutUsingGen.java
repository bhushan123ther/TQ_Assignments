package com.setAssignment;

import java.util.HashSet;

public class CreateHashSetWithoutUsingGen {

	public static void main(String[] args) {
		HashSet hs = new HashSet();

		// Add Integer objects to the HashSet
		hs.add(new Integer(1));
		hs.add(new Integer(2));
		hs.add(new Integer(3));
		hs.add(new Integer(3));
		hs.add(new Integer(4));

		System.out.println(hs);

	}

}
