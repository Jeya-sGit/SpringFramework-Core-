package com.SpringwithXml.Interface.example;

public class University {
	
	private College col;
	

	public void setCol(College col) {
		this.col = col;
	}
	 
	public void display() {
		col.studentDetails();
	}

}
