package com.linkedlist_assignment;

import java.util.LinkedList;

public class TestLLEmptyOrNot {

	public static void main(String[] args) {
		LinkedList<Integer> list1 = new LinkedList<>();
		list1.add(1);
		list1.add(2);
		list1.add(3);

		if (!list1.isEmpty()) {
			System.out.println(list1);
		} else {
			System.out.println("Linked list is empty");
		}
	}

}
