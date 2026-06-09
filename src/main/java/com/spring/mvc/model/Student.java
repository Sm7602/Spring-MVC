package com.spring.mvc.model;

public class Student {
	private int id;
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

	public Student(int id,String name, String department, int age, int mark, String address, int phnum) {
		super();
		this.id=id;
		this.name = name;
		this.department = department;
		this.age = age;
		this.mark = mark;
		this.address = address;
		this.phnum = phnum;
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
		return "Student [id=" + id + ", name=" + name + ", department=" + department + ", age=" + age + ", mark=" + mark
				+ ", address=" + address + ", phnum=" + phnum + "]";
	}

	
	
	
	
}