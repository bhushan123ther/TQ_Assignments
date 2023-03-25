//10. WAP to retain all elements from ArrayList

package com.arraylist_assignment;

import java.util.ArrayList;

public class RetainAllElements {

	public static void main(String[] args) {

		ArrayList<String> colors1 = new ArrayList<String>();
		colors1.add("Red");
		colors1.add("Green");
		colors1.add("Blue");
		colors1.add("White");

		ArrayList<String> colors2 = new ArrayList<String>();
		colors2.add("Green");
		colors2.add("Blue");
		colors2.add("Yellow");
		colors2.add("White");

		System.out.println("Before retaining elements : ");
		System.out.println("Colors1 : " + colors1);
		System.out.println("Colors2 : " + colors2);

		colors1.retainAll(colors2);

		System.out.println("After retaining elements :  ");
		System.out.println("Colors1 : " + colors1);

	}

}
