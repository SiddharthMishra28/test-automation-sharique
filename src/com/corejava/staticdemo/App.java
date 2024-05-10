package com.corejava.staticdemo;

public class App {
	public static void main(String[] args) {
		Student st = new Student();
		Student.SchoolName = "initial value";
		Student st2 = new Student();
		System.out.println(st.getSchoolName());
		st.setSchoolName("manipulated value");
		System.out.println(st2.getSchoolName());
	}
}
