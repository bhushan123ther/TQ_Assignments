package com.setAssignment;

import java.util.LinkedHashSet;

class Emplhsd {
	private int id;
	private String name;

	public Emplhsd(int id, String name) {
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
		Emplhsd other = (Emplhsd) obj;
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

public class EmployeeLHSD {

	public static void main(String[] args) {

		LinkedHashSet<Emplhsd> emplist = new LinkedHashSet<>();

		Emplhsd emp1 = new Emplhsd(101, "Ram");
		Emplhsd emp2 = new Emplhsd(102, "Guru");
		Emplhsd emp3 = new Emplhsd(103, "Mina");

		emplist.add(emp1);
		emplist.add(emp2);
		emplist.add(emp3);

		System.out.println("Employees in the LinkedHashSet : ");
		for (Emplhsd emp : emplist) {
			System.out.println(emp.getId() + " " + emp.getName());
		}

		Emplhsd emp4 = new Emplhsd(101, "Muthal");
		emplist.add(emp4);

		System.out.println("Employees in the LinkedHashSet after adding duplicates : ");
		for (Emplhsd emp : emplist) {
			System.out.println(emp.getId() + " " + emp.getName());
		}
	}
}
