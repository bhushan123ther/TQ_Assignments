package com.assignment;

class Derived {
	public void getDetails(String temp) {
		System.out.println("Derived class " + temp);
	}
}

public class Test extends Derived {
	public void getDetails(String temp) // The return type is incompatible with Derived.getDetails(String)
	{
		System.out.println("Test class " + temp);
	}

	public static void main(String[] args) {
		Test obj = new Test();
		obj.getDetails("Hello");
	}
}
