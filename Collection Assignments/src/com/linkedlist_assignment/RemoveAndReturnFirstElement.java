package com.linkedlist_assignment;

import java.util.LinkedList;

public class RemoveAndReturnFirstElement {

	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);

		System.out.println("Remove first element " + list.removeFirst());
		System.out.println(list);

	}

}
