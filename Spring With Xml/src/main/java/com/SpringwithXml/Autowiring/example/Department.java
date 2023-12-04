package com.SpringwithXml.Autowiring.example;

public class Department {
	
	private String name;
	private int id;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public void deptInfo() {
		System.out.println("Welcome to "+name);
		System.out.println("Department ID : "+id);
	}

}
