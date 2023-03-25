//. WAP to use add operation of ArrayList

package com.arraylist_assignment;

import java.util.ArrayList;

public class AddOperation {

	public static void main(String[] args) {

		ArrayList<Integer> al = new ArrayList<>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);

		ArrayList<Integer> newal = new ArrayList<>();
		newal.addAll(al);
		newal.add(60);

		System.out.println(newal);

	}

}
