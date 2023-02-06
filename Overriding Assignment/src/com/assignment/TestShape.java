package com.assignment;

class Shape {
	void draw() {
		System.out.println("Draw spapes...");
	}
}

class Circle extends Shape {
	void draw() {
		System.out.println("Draw circle..");
	}
}

class Rectangle extends Shape {
	void draw() {
		System.out.println("Draw rectangle...");
	}
}

public class TestShape {
	public static void main(String[] args) {

		Rectangle rect1 = new Rectangle();
		rect1.draw();
	}

}
