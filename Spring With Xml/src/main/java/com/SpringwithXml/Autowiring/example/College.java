package com.SpringwithXml.Autowiring.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class  College {
	@Autowired
	@Qualifier("depteeeref")
	private Department dept;
	
	private Staff staff;
	private Students stud;
	
	
	public void setDept(Department dept) {
		this.dept = dept;
	}
    
	@Autowired 
	@Qualifier("Staffeeeref")
	public void setStaff(Staff staff) {
		this.staff = staff;
	}
	
	@Autowired
	@Qualifier("Stdeeeref")
	public void setStud(Students stud) {
		this.stud = stud;
	}

	public void display() {
		
		dept.deptInfo();
		staff.staffInfo();
		stud.stdInfo();
		
		
	}

}
