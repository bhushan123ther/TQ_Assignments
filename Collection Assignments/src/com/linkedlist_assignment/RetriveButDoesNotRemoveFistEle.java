package com.linkedlist_assignment;

import java.util.LinkedList;

public class RetriveButDoesNotRemoveFistEle {

	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);

		// Retrieve but do not remove the first element using the getFirst() method
		int firstElement = list.getFirst();

		// Print the retrieved first element
		System.out.println("Retrieved First Element: " + firstElement);

		// Print the original linked list
		System.out.println("Original Linked List: " + list);

	}

}
