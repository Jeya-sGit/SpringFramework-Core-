package com.SpringwithXml.Interface.example;

public class EEE implements College{
	
	private String name;
	private int id;
	private String dept;
	
	
	
	public void setName(String name) {
		this.name = name;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public void studentDetails() {
		System.out.println("Name : "+name+" Depatment : "+dept+" ID : "+id);
		
	}


}
