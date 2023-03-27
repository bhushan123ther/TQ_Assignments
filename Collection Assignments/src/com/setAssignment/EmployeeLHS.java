package com.setAssignment;

import java.util.LinkedHashSet;

class EmpLHS {
	private int id;
	private String name;

	public EmpLHS(int id, String name) {
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
	public String toString() {
		return "EmpLHS [id=" + id + ", name=" + name + "]";
	}

}

public class EmployeeLHS {

	public static void main(String[] args) {

		LinkedHashSet<EmpLHS> lhslist = new LinkedHashSet<>();

		EmpLHS emp1 = new EmpLHS(101, "Ram");
		EmpLHS emp2 = new EmpLHS(102, "Sham");
		EmpLHS emp3 = new EmpLHS(103, "Nita");

		lhslist.add(emp1);
		lhslist.add(emp2);
		lhslist.add(emp3);

		for (EmpLHS emp : lhslist) {
			System.out.println(emp.getId() + " " + emp.getName());
		}
	}
}
