package com.spring.mvc.model;

public class Student {
	private String name;
	private String department;
	private int age;
	private int mark;
	private String address;
	private int phnum;
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(String name, String department, int age, int mark, String address, int phnum) {
		super();
		this.name = name;
		this.department = department;
		this.age = age;
		this.mark = mark;
		this.address = address;
		this.phnum = phnum;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getMark() {
		return mark;
	}

	public void setMark(int mark) {
		this.mark = mark;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getPhnum() {
		return phnum;
	}

	public void setPhnum(int phnum) {
		this.phnum = phnum;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", department=" + department + ", age=" + age + ", mark=" + mark + ", address="
				+ address + ", phnum=" + phnum + "]";
	}
	
	
	
	
}