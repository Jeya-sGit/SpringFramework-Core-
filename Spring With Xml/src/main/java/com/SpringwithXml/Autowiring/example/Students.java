package com.SpringwithXml.Autowiring.example;

public class Students {
	
	private String Name;
	private int id;
	private String department;
	private String AcademicStatus;
	
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	
	public String getAcademicStatus() {
		return AcademicStatus;
	}
	public void setAcademicStatus(String academicStatus) {
		AcademicStatus = academicStatus;
	}
	public void stdInfo() {
		System.out.println("Our Pride Student");
		System.out.println("Name : "+Name+"|"+"Student ID : "+id+"|"+"Department : "+department+"|"+"Academic Status : "+AcademicStatus);
	}
	

}
