package com.springcore.component;

import org.springframework.stereotype.Component;

@Component /*
			 * Spring IOC container will automatically create Student obj with name student its an
			 * alternative of <bean> tag  in xml  that create obj of a class
			 */
public class Student {
	
	private int studentId;
	private String studentName;
	
	
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + "]";
	}
	
	

}
