package com.arraylist_assignment;

import java.util.ArrayList;

public class ReplaceElement {

	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<>();

		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);

		System.out.println("Original Arraylist : " + list);

		list.set(1, 6);

		System.out.println("Modified Arraylist : " + list);

	}

}
