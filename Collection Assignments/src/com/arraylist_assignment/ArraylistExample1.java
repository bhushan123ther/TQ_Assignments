/* 1. WAP to add elements to arraylist without using generics (no <>) and print content of it where
Integer is used. In second arraylist String is used.
 */

package com.arraylist_assignment;

import java.util.ArrayList;

public class ArraylistExample1 {

	public static void main(String[] args) {

		ArrayList al = new ArrayList();

		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		al.add(60);

		System.out.println(al);

		ArrayList newal = new ArrayList();

		newal.add("Emli");
		newal.add("Tarun");
		newal.add("Bhushan");
		newal.add("Anand");
		newal.add("Nitin");
		newal.add("Praful");

		System.out.println(newal);
	}

}
