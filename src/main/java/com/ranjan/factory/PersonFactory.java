package com.ranjan.factory;

import java.lang.reflect.Constructor;

import com.ranjan.comp.AadharDetails;
import com.ranjan.comp.Customer;
import com.ranjan.comp.Employee;
import com.ranjan.comp.Person;
import com.ranjan.comp.Student;

public class PersonFactory {
	
	public static <T extends Person> T getPerson(Class<T> clazz) throws Exception{
		
		Constructor cons[]=clazz.getDeclaredConstructors();
		Object obj = null;
		if(clazz == Employee.class) {
			AadharDetails ad = new AadharDetails(13243L, 21, 5432L);
			obj = cons[0].newInstance("Anurag", "RNC", ad, "Google", 98765);
		}
		else if(clazz == Customer.class) {
			AadharDetails ad = new AadharDetails(4567L, 22, 76543L);
			obj = cons[0].newInstance("anil","vizag",ad,1234,9000.0);
		}
		else if(clazz==Student.class) 
		{
			AadharDetails details=new AadharDetails(113451L, 31, 9412354L);
			obj=cons[0].newInstance("suresh","delhi",details,"java",11);
		}
		else
		{
			throw new IllegalArgumentException("Invalid Person Type");
		}
		return (T)obj;
	}
	
	

	/*		public static Person getPerson(String type) {
				Person per = null;
				AadharDetails ad = null;
				if(type.equalsIgnoreCase("emp")) {
					ad = new AadharDetails(13243L, 21, 5432L);
					per = new Employee("Anurag", "RNC", ad, "Google", 98765);
				}
				else if(type.equalsIgnoreCase("cst")){
					ad = new AadharDetails(4567L, 22, 76543L);
					per=new Customer("anil","vizag",ad,1234,9000.0); 
				}
				else if(type.equalsIgnoreCase("stud")) {
					ad=new AadharDetails(1234216L, 22, 921154354L);
					per=new Student("ramesh","hyd",ad,"java",12456);
				}
				else {
					throw new IllegalArgumentException("Invalid Person Type");
				}
				return per;
			}*/
}
