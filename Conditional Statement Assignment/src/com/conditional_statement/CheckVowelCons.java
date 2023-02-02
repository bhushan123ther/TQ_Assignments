//4. Write a Java program to input any alphabet and check whether it is vowel or consonant
package com.conditional_statement;

import java.util.Scanner;

public class CheckVowelCons {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter character to check vowel or consonat : ");
		char vc = sc.next().charAt(0);

		if (vc == 'a' || vc == 'e' || vc == 'i' || vc == 'o' || vc == 'u' || vc == 'A' || vc == 'E' || vc == 'I'
				|| vc == 'O' || vc == 'U') {
			System.out.println(vc + " is vowel");
		} else {
			System.out.println(vc + " is consonant");
		}
		sc.close();
	}
}
