package com.linkedlist_assignment;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ConvertLinkedListToArray {

	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);

		// Convert the linked list to an array list using the ArrayList constructor
		List<Integer> arrayList = new ArrayList<>(list);

		// Print the array list
		System.out.println("Array List: " + arrayList);
	}

}
