package com.ranjan.test;

import com.ranjan.comp.Customer;
import com.ranjan.comp.Employee;
import com.ranjan.comp.Person;
import com.ranjan.factory.PersonFactory;

public class FactoryPatternProblemTest {

	public static void main(String[] args) {

		//factory method is creating object
		try {
		Employee emp = PersonFactory.getPerson(Employee.class);
		System.out.println(emp);
		emp.sayHello("Raja");  //we can use class specific method also, is code safe now using generic methods.
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		try {
		System.out.println("===================================================");
		Person cst = PersonFactory.getPerson(Customer.class);
		System.out.println(cst);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
