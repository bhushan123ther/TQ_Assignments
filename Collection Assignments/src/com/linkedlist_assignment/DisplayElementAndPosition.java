package com.linkedlist_assignment;

import java.util.LinkedList;

public class DisplayElementAndPosition {

	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<>();
		list.add("Akhii");
		list.add("Bakii");
		list.add("Chunu");
		list.add("Munu");

		for (int i = 0; i < list.size(); i++) {
			System.out.println(i + 1 + " : " + list.get(i));
		}

	}

}
