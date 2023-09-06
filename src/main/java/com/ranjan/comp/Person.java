package com.ranjan.comp;

public abstract class Person {

	private String name;
	private String adds;
	private AadharDetails aadhar;
	
	public Person(String name, String adds, AadharDetails aadhar) {
		this.name = name;
		this.adds = adds;
		this.aadhar = aadhar;
	}
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", adds=" + adds + ", aadhar=" + aadhar + "]";
	}
	
	
}
