package com.setAssignment;

import java.util.HashSet;

class Employee2 {
	private int id;
	private String name;

	public Employee2(int id, String name) {
		super();
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
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee2 other = (Employee2) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

}

public class EmployeeHashSet {

	public static void main(String[] args) {

		HashSet<Employee2> empSet = new HashSet<Employee2>();

		Employee2 emp1 = new Employee2(101, "Bhushan");
		Employee2 emp2 = new Employee2(102, "Ram");
		Employee2 emp3 = new Employee2(103, "Vishal");

		empSet.add(emp1);
		empSet.add(emp2);
		empSet.add(emp3);

		for (Employee2 emp : empSet) {
			System.out.println("ID : " + emp.getId() + " , Name : " + emp.getName());
		}
	}

}
