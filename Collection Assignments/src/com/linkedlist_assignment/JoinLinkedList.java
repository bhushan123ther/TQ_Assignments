package com.linkedlist_assignment;

import java.util.LinkedList;

public class JoinLinkedList {

	public static void main(String[] args) {

		LinkedList<Integer> list = new LinkedList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);

		LinkedList<Integer> list2 = new LinkedList<>();
		list2.add(6);
		list2.add(7);
		list2.add(8);
		list2.add(9);
		list2.add(10);

		list.addAll(list2);

		System.out.println("Joined Linked List : " + list);

	}

}
