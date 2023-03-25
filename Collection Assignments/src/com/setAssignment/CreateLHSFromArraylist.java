package com.setAssignment;

import java.util.ArrayList;
import java.util.LinkedHashSet;

public class CreateLHSFromArraylist {

	public static void main(String[] args) {
		ArrayList<Integer> arrayList = new ArrayList<>();
		arrayList.add(1);
		arrayList.add(2);
		arrayList.add(3);

		LinkedHashSet<Integer> lhs = new LinkedHashSet<>(arrayList);

		System.out.println(lhs);

	}

}
