package com.switch_assignment;

import java.util.Scanner;

public class CheckAlph {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter alphabet : ");
		char ch = sc.next().charAt(0);
		boolean flag = false;

		switch (ch) {
		case 'a':
		case 'A':
		case 'E':
		case 'e':
		case 'i':
		case 'I':
		case 'o':
		case 'O':
		case 'u':
		case 'U':
			System.out.println("Vowel");
			flag = true;
			break;
		}

		if (flag == false) {
			System.out.println("Consonant");
		}
	}
}
