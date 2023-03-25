//6. WAP to insert elements into the linked list at the first and last position.

package com.linkedlist_assignment;

import java.util.LinkedList;

public class InsertFirstLast {

	public static void main(String[] args) {

		LinkedList<String> list = new LinkedList<>();

		// Adding linked list

		list.add("apple");
		list.add("orange");
		list.add("cherry");
		list.add("date");
		list.add("banana");

		list.addFirst("CusterdApple");
		list.addLast("Watermelon");

		System.out.println(list);
	}
}
