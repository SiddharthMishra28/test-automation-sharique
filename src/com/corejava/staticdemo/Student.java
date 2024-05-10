package com.corejava.staticdemo;

public class Student {
	private String studentName;
	private int rollNo;
	private String email;
	public static String SchoolName;
	
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public static String getSchoolName() {
		return SchoolName;
	}
	public static void setSchoolName(String schoolName) {
		SchoolName = schoolName;
	}
	
}
