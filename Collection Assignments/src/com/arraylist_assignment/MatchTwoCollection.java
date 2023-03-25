//19. WAP to match two collections

package com.arraylist_assignment;

import java.util.ArrayList;

public class MatchTwoCollection {

	public static void main(String[] args) {

		ArrayList<String> al = new ArrayList<>();

		al.add("Ram");
		al.add("Sham");
		al.add("Gita");

		ArrayList<String> newal = new ArrayList<>();

		newal.add("Ram");
		newal.add("Shanboo");
		newal.add("Yogi");

		al.retainAll(newal);

		if (al.isEmpty()) {
			System.out.println("The collections do not have any matching elements.");
		} else {
			System.out.println("The collection have the following matching elements.");
			for (String name : al) {
				System.out.println(name);
			}
		}
	}
}
