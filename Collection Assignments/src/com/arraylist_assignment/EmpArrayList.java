package com.arraylist_assignment;

/*WAP to create Emp (id,name,sal) object and add 2objects to ArrayList. Sysout and see both variable
memory space is printed. This is because toString is not overriden but if you would have done this
for Integer then beautiful output would have been printed.*/

import java.util.ArrayList;

class Emp {
	int id;
	String name;
	double sal;

	public Emp(int id, String name, double sal) {
		this.id = id;
		this.name = name;
		this.sal = sal;
	}

}

class EmpArrayList {
	public static void main(String[] args) {
		ArrayList<Emp> empList = new ArrayList<Emp>();

		Emp emp1 = new Emp(101, "John", 50000);
		Emp emp2 = new Emp(102, "Rony", 450000);
		empList.add(emp1);
		empList.add(emp2);

		// Print the memory address of both Emp objects

		System.out.println("Emp 1 : " + emp1.toString());
		System.out.println("Emp 2 : " + emp2.toString());

		System.out.println("=================================================");

		ArrayList<Integer> intList = new ArrayList<Integer>();

		Integer int1 = new Integer(10);
		Integer int2 = new Integer(20);
		intList.add(int1);
		intList.add(int2);

		// Print the Integer objects

		System.out.println("Int 1 : " + int1.toString());
		System.out.println("Int 2 : " + int2.toString());
	}
}
