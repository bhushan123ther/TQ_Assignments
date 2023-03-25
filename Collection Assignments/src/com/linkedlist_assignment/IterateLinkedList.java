// 2. WAP to iterate through all elements in a linked list

package com.linkedlist_assignment;

import java.util.Iterator;
import java.util.LinkedList;

public class IterateLinkedList {

	public static void main(String[] args) {

		LinkedList<String> list = new LinkedList<>();

		list.add("Orange");
		list.add("Apple");
		list.add("Banana");
		list.add("Grapes");

		Iterator<String> itr = list.iterator();

		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
