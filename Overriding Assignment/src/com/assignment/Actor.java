package com.assignment;

class Person {
	void readScript() {
		System.out.println("This is script for normal person...");
	}
}

public class Actor {
	void readScript() {
		System.out.println("This is script for actor ...");
	}

	public static void main(String[] args) {
		Actor rajkumar_rav = new Actor();
		rajkumar_rav.readScript();
	}
}
