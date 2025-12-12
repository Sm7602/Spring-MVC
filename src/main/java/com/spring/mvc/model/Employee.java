package com.spring.mvc.model;

public class Employee {
	int age;
	String name;
	 
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(String name,   int age) {
		super();
		this.name = name;
		 
		this.age = age;
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
		return "Employee [age=" + age + ", name=" + name +   "]";
	}
	

}
