package com.arraylist_assignment;

import java.util.ArrayList;

class Employee2 {
	int id;
	String name;
	int sal;

	public Employee2(int id, String name, int sal) {
		this.id = id;
		this.name = name;
		this.sal = sal;
	}

	public String toString() {
		return "Emloyee [ Id = " + id + " , Name = " + name + " , Salary = " + sal + " ]";
	}
}

public class HighesSal {

	public static void main(String[] args) {

		ArrayList<Employee2> emplist = new ArrayList<>();
		emplist.add(new Employee2(101, "Randip", 4000));
		emplist.add(new Employee2(102, "Gabbar", 7000));
		emplist.add(new Employee2(103, "Rajkumar", 9000));
		emplist.add(new Employee2(104, "Sushant", 5000));

		int highestSal = 0;

		for (Employee2 emp : emplist) {
			if (emp.sal > highestSal) {
				highestSal = emp.sal;
			}
		}

		System.out.println("The highest salary is : " + highestSal);
	}

}
