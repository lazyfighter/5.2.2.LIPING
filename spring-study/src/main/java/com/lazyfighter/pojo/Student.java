package com.lazyfighter.pojo;

public class Student {

	private String name;
	private String gender;

//	public static Student from(Person person) {
//		Student student = new Student();
//		student.setName(person.getName());
//		student.setGender(person.getGender());
//		return student;
//	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@Override public String toString() {
		return "Student{" +
				"name='" + name + '\'' +
				", gender='" + gender + '\'' +
				'}';
	}
}
