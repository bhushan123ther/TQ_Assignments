package com.linkedlist_assignment;

import java.util.LinkedList;
import java.util.ListIterator;

public class ReverseOrder {

	public static void main(String[] args) {

		LinkedList<String> list = new LinkedList<>();

		list.add("Orange");
		list.add("Apple");
		list.add("Banana");
		list.add("Grapes");

		System.out.println(list);
		ListIterator<String> list1 = list.listIterator(list.size());

		while (list1.hasPrevious()) {
			String str = list1.previous();
			System.out.println(str);
		}

	}

}
