//1. WAP to append the specified element to the end of a linked list.

package com.linkedlist_assignment;

import java.util.LinkedList;

public class AppendElement {

	public static void main(String[] args) {

		LinkedList<String> list = new LinkedList<>();

		list.add("Orange");
		list.add("Apple");
		list.add("Banana");
		list.add("Grapes");

		// Display the linked list before appending
		System.out.println("Linked list before appending : " + list);

		// Appending a new element to the end of the linked list
		list.add("cherry");

		// Displaying the linked list after appending
		System.out.println("Linked list after appending : " + list);

	}

}
