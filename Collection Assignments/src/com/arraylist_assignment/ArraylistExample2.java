/*WAP add elements to arraylist without using generics, 0th location keep Integer, 1st location String
now print each element and display contents.*/

package com.arraylist_assignment;

import java.util.ArrayList;

public class ArraylistExample2 {

	public static void main(String[] args) {

		ArrayList al = new ArrayList();
		al.add(10);
		al.add("Bhushan");

		for (int i = 0; i < al.size(); i++) {
			System.out.println("Element at index " + i + " : " + al.get(i));
		}
	}

}
