package com.spring.mvc.model;

public class Employee {
	private int id;
	private int age;
	private String name;
	 
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(int id,String name,int age) {
		super();
		this.name = name;
		this.id=id;
		this.age = age;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", age=" + age + ", name=" + name + "]";
	}

}
