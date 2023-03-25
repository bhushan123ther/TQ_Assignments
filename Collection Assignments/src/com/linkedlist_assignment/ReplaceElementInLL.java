package com.linkedlist_assignment;

import java.util.LinkedList;

public class ReplaceElementInLL {

	public static void main(String[] args) {
		LinkedList<Integer> list1 = new LinkedList<>();
		list1.add(1);
		list1.add(2);
		list1.add(3);

		list1.set(1, 5);

		System.out.println(list1);
	}

}
