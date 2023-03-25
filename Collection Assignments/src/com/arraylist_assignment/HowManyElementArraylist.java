//11. WAP to know how many elements in ArrayList

package com.arraylist_assignment;

import java.util.ArrayList;

public class HowManyElementArraylist {

	public static void main(String[] args) {

		ArrayList<Integer> al = new ArrayList<>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);

		System.out.println("How many elements are present in arraylist :  " + al.size());

	}
}
