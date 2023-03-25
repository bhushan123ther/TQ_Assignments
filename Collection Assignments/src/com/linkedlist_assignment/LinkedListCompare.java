package com.linkedlist_assignment;

import java.util.LinkedList;

public class LinkedListCompare {

	public static void main(String[] args) {
		LinkedList<Integer> list1 = new LinkedList<>();
		list1.add(1);
		list1.add(2);
		list1.add(3);

		LinkedList<Integer> list2 = new LinkedList<>();
		list2.add(1);
		list2.add(2);
		list2.add(4);

		// Compare the two linked lists using the equals() method
		boolean isEqual = list1.equals(list2);

		// Print the result of the comparison
		if (isEqual) {
			System.out.println("The two linked lists are equal.");
		} else {
			System.out.println("The two linked lists are not equal.");
		}

	}

}
