package com.SpringwithXml.Autowiring.example;

public class Staff {
	
	private String Name;
	private int id;
	private String Designation;
	private String depart;
	
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
	public String getDepart() {
		return depart;
	}
	public void setDepart(String depart) {
		this.depart = depart;
	}
	
	public String getDesignation() {
		return Designation;
	}
	public void setDesignation(String designation) {
		Designation = designation;
	}
	public void staffInfo() {
		System.out.println("Our Department Staffs");
		System.out.println("Name : "+Name+"|"+"Staff ID : "+id+"|"+"Designation : "+Designation+"|"+"Department : "+depart);
	}

	
}
