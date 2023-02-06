/*5)WAP to create class Programmer with Method workingHours().create class Employee which extends Programmer implement workingHours()differently in child.*/

package com.assignment;

class Programmer {
	void workingHours() {
		System.out.println("Working 7-8 hours in a day");
	}
}

class Employee extends Programmer {
	void workingHours() {
		System.out.println("Working 12 hours in a day");
	}
}

public class TestProgrammer {

	public static void main(String[] args) {
		Employee emp1 = new Employee();
		emp1.workingHours();
	}

}
