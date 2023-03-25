package com.arraylist_assignment;

import java.util.ArrayList;

public class RemoveElement {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);

		// WAP to remove elements from ArrayList
		al.remove(4);
		System.out.println(al);

		// WAP to remove all elements from ArrayList

		al.removeAll(al);
		System.out.println(al);

	}
}
