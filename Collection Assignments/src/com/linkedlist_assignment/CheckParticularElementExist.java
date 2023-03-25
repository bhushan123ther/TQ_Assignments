package com.linkedlist_assignment;

import java.util.LinkedList;

public class CheckParticularElementExist {

	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);

		int element = 6;
		if (list.contains(element)) {
			System.out.println("Element " + element + " is present");
		} else {
			System.out.println("Element " + element + " is not present");
		}

	}

}
