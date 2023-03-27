package com.setAssignment;

import java.util.LinkedHashSet;
import java.util.Set;

public class ContentLinkedHashSet {

	public static void main(String[] args) {

		Set<String> list = new LinkedHashSet<>();
		list.add("Ram");
		list.add("Sham");
		list.add("Rugved");
		list.add("Ravina");

		for (String names : list) {
			System.out.println(names);
		}
	}

}
