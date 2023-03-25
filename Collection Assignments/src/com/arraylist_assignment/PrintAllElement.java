package com.arraylist_assignment;

import java.util.ArrayList;
import java.util.Iterator;

public class PrintAllElement {

	public static void main(String[] args) {

		ArrayList<Integer> al = new ArrayList<>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);

		// Iterate all element using iterator

		System.out.println("================= Iterate using iterator ======================");

		Iterator<Integer> itr = al.iterator();

		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		System.out.println("=================== Iterate using for loop ====================");
		// Iterate all element using for loop

		for (int i = 0; i < al.size(); i++) {
			System.out.println(al.get(i));
		}

		System.out.println("==================== Iterate using for each loop ===================");
		// Iterate all element using for each

		for (Integer i : al) {
			System.out.println(i);
		}
	}

}
