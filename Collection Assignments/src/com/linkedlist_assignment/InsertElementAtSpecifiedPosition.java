package com.linkedlist_assignment;

import java.util.LinkedList;

public class InsertElementAtSpecifiedPosition {

	public static void main(String[] args) {

		LinkedList<String> list = new LinkedList<>();
		list.add("Akhii");
		list.add("Bakii");
		list.add("Chunu");
		list.add("Munu");

		System.out.println(list);
		list.add(3, "Rajvir");

		System.out.println("Element add on 4th position : " + list);
	}

}
