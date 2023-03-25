package com.linkedlist_assignment;

import java.util.LinkedList;

public class RetriveButDoesNotRemoveLastEle {

	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);

		int lastElement = list.getLast();

		System.out.println("Retrive last element : " + lastElement);

		System.out.println(list);

	}

}
