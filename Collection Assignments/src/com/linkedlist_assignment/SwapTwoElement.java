package com.linkedlist_assignment;

import java.util.Collections;
import java.util.LinkedList;

public class SwapTwoElement {

	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<>();
		list.add("Akhii");
		list.add("Bakii");
		list.add("Chunu");
		list.add("Munu");

		System.out.print("Before swapping : " + list);

		Collections.swap(list, 1, 2);

		System.out.println();

		System.out.print("After swaping : " + list);

	}

}
