//3. WAP to iterate through all elements in a linked list starting at the specified position.

package com.linkedlist_assignment;

import java.util.LinkedList;

public class IterateFromPosition {

	public static void main(String[] args) {

		// creating a linked list
		LinkedList<String> list = new LinkedList<>();

		// Adding linked list

		list.add("apple");
		list.add("orange");
		list.add("cherry");
		list.add("date");
		list.add("banana");
		list.add(2, "Khazur"); // insert element at proper position

		// starting position

		int position = 2;

		System.out.println(
				"Iterating through the linked list starting from position " + position + " using a for loop : ");

		for (int i = position; i < list.size(); i++) {
			System.out.println(list.get(i));
		}

	}
}
