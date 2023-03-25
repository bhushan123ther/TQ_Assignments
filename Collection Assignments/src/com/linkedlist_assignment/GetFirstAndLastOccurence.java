package com.linkedlist_assignment;

import java.util.LinkedList;

public class GetFirstAndLastOccurence {

	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<>();
		list.add("Akhii");
		list.add("Bakii");
		list.add("Chunu");
		list.add("Munu");

		System.out.println("Get first occurence of linked list : " + list.getFirst());
		System.out.println("Get last occurence of linked list : " + list.getLast());

	}

}
