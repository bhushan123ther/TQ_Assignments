package com.switch_assignment;

import java.util.Scanner;

public class StringSwitchExmple {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Programming language name : ");
		String lang = sc.next();

		switch (lang) {
		case "C":
			System.out.println("Dennis Ritchie");
			break;
		case "Java":
			System.out.println("Jemmes Gosling");
			break;
		case "Python":
			System.out.println("Guido Van Rossum");
			break;
		case "C++":
			System.out.println("Bjarne Stroustrup");
			break;
		case "JavaScript":
			System.out.println("Brendan Eich");
			break;

		default:
			System.out.println("Currenty data not available,sorry for inconvenience.....");
		}
	}
}
