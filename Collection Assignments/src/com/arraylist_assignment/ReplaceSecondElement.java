package com.arraylist_assignment;

import java.util.ArrayList;

public class ReplaceSecondElement {

	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		list.add(60);

		System.out.println("Before replacing second position elements :");
		System.out.println(list);

		list.set(1, 11);

		System.out.println("After replacing second position elements : ");
		System.out.println(list);

	}

}
