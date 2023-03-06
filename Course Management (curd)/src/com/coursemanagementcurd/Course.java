package com.coursemanagementcurd;

public class Course {

	private int id;
	private String name;
	private double fees;

	public Course(int id, String name, double fees) {
		this.id = id;
		this.name = name;
		this.fees = fees;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public double getFees() {
		return fees;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setFees(double fees) {
		this.fees = fees;
	}

	public String toString() {
		return "Course [id=" + id + ", name=" + name + ", fees=" + fees + "]";
	}

}
