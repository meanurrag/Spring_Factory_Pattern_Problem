package com.ranjan.comp;

public class Student extends Person{

	private String course;
	private int rollno;
	
	public Student(String name, String adds, AadharDetails aadhar, String course, int rollno) {
		super(name, adds, aadhar);
		this.course = course;
		this.rollno = rollno;
	}

	@Override
	public String toString() {
		return "Student [course=" + course + ", rollno=" + rollno + ", toString()=" + super.toString() + "]";
	}

	
	
	
	
}
