package com.ranjan.comp;

public class Employee extends Person
{
	private String company;
	private double salary;
	
	public Employee(String name, String adds, AadharDetails aadhar, String company, double salary) {
		super(name, adds, aadhar);
		this.company = company;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [company=" + company + ", salary=" + salary + ", toString()=" + super.toString() + "]";
	}
	
	public void sayHello(String str) {
		System.out.println("Hello : "+str);
	}
	
}
