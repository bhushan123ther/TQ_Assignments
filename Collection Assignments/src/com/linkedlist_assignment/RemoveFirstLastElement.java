package com.linkedlist_assignment;

import java.util.LinkedList;

public class RemoveFirstLastElement {
	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<>();
		list.add("Akhii");
		list.add("Bakii");
		list.add("Chunu");
		list.add("Munu");

		list.removeFirst();
		list.removeLast();

		System.out.println(list);
	}
}
