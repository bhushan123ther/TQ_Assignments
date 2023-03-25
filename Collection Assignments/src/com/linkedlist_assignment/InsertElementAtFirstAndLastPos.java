package com.linkedlist_assignment;

import java.util.LinkedList;

public class InsertElementAtFirstAndLastPos {

	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<>();
		list.add("Akhii");
		list.add("Bakii");
		list.add("Chunu");
		list.add("Munu");

		System.out.println("Before adding on first and last position element : ");
		System.out.println(list);

		list.addFirst("Vishal");
		list.addLast("Rukhi");

		System.out.println("After addig on first and last position element : ");
		System.out.println(list);

	}

}
