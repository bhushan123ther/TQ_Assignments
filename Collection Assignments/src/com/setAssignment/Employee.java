package com.setAssignment;

import java.util.HashSet;

public class Employee {

	private int id;
	private String name;

	Employee(int id, String name) {
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
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;
		Employee employee = (Employee) o;
		return id == employee.id;
	}

	@Override
	public int hashCode() {
		return id;
	}

	public static void main(String[] args) {

		HashSet<Employee> employees = new HashSet<Employee>();
		employees.add(new Employee(1, "John"));
		employees.add(new Employee(2, "Rony"));
		employees.add(new Employee(3, "Bob"));

		for (Employee employee : employees) {
			System.out.println("Employee ID : " + employee.getId() + " , Name : " + employee.getName());
		}

	}

}
