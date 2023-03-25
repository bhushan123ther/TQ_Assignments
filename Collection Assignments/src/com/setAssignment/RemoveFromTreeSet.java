package com.setAssignment;

import java.util.TreeSet;

public class RemoveFromTreeSet {

	public static void main(String[] args) {

		TreeSet<Integer> treeSet = new TreeSet<>();
		treeSet.add(3);
		treeSet.add(1);
		treeSet.add(2);

		boolean removed = treeSet.remove(2);

		System.out.println(treeSet);
	}

}
