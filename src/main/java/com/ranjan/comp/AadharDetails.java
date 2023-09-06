package com.ranjan.comp;

public class AadharDetails {
		
	private long aadhar;
	private int age;
	private long mobileno;
	
	public AadharDetails(long aadhar, int age, long mobileno) {
		this.aadhar = aadhar;
		this.age = age;
		this.mobileno = mobileno;
	}
	
	@Override
	public String toString() {
		return "AadharDetails [aadhar=" + aadhar + ", age=" + age + ", mobileno=" + mobileno + "]";
	}
	
	
}
