//12. WAP to test an ArrayList is empty or not

package com.arraylist_assignment;

import java.util.ArrayList;

public class TestArraylistEmpty {

	public static void main(String[] args) {

		ArrayList<Integer> al = new ArrayList<>();

		if (al.isEmpty()) {
			System.out.println("The arraylist is empty.");
		} else {
			System.out.println("The arraylist is not empty.");
		}

		al.add(10);
		al.add(20);

		if (al.isEmpty()) {
			System.out.println("The arraylist is empty.");
		} else {
			System.out.println("The arraylist is not empty.");
		}

		// 13. empty arraylist

		System.out.println("============= empty() arraylist ========================================");

		ArrayList<String> newal = new ArrayList<>();
		newal.add("Rahul");
		newal.add("Vishal");

		newal.removeAll(newal);

		System.out.println(newal);
	}
}
