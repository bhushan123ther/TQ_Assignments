//14. WAP to search an element from ArrayList

package com.arraylist_assignment;

import java.util.ArrayList;

public class SearchElementFromArraylist {

	public static void main(String[] args) {

		ArrayList<Integer> al = new ArrayList<>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);

		int element = al.get(3);

		if (al.contains(element)) {
			System.out.println("Element present in arraylist.");
		} else {
			System.out.println("Element not present in arraylist.");
		}
	}
}
