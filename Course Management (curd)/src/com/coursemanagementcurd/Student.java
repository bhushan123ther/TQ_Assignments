package com.coursemanagementcurd;

public class Student {

	private int id;
	private String name;
	private int age;
	private Course course;

	public Student(int id, String name, int age, Course course) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.course = course;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + ", course=" + course + "]";
	}
}
