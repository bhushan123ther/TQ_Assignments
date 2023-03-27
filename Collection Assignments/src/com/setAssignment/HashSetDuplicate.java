package com.setAssignment;

import java.util.HashSet;
import java.util.Set;

class Employee3 implements Comparable<Employee3> {
	private int id;
	private String name;

	public Employee3(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int compareTo(Employee3 other) {
		return this.id - other.id;
	}

	@Override
	public int hashCode() {
		return id;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null || getClass() != obj.getClass()) {
			return false;
		}
		Employee3 other = (Employee3) obj;
		return id == other.id;
	}
}

public class HashSetDuplicate {

	public static void main(String[] args) {

		Set<Employee3> empSet = new HashSet<>();

		Employee3 emp1 = new Employee3(101, "Shiv");
		Employee3 emp2 = new Employee3(102, "Radha");
		Employee3 emp3 = new Employee3(103, "Sitha");

		empSet.add(emp1);
		empSet.add(emp2);
		empSet.add(emp3);

		System.out.println("Employees in the set : ");
		for (Employee3 emp : empSet) {
			System.out.println(emp.getId() + " : " + emp.getName());
		}

		Employee3 emp4 = new Employee3(101, "Peter");
		empSet.add(emp4);

		System.out.println("Employees in the set after adding duplicates : ");
		for (Employee3 emp : empSet) {
			System.out.println(emp.getId() + " " + emp.getName());
		}
	}
}
